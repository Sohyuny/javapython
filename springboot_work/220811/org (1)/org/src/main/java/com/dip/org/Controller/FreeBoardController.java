package com.dip.org.Controller;

import com.dip.org.entity.FreeBoard;
import com.dip.org.entity.FreeBoardTail;
import com.dip.org.req.FreeBoardReq;
import com.dip.org.req.FreeBoardTailReq;
import com.dip.org.respository.FreeBoardRepository;
import com.dip.org.respository.FreeBoardTailRepository;
import com.dip.org.service.FreeBoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.time.LocalDateTime;
import java.util.List;

@Controller
public class FreeBoardController {
    @Autowired
    private FreeBoardService freeBoardService;

    @Autowired
    private FreeBoardRepository freeBoardRepository;

    @Autowired
    private FreeBoardTailRepository freeBoardTailRepository;

    @GetMapping("freeboard/delete")
    public String delete(long id){
//        FreeBoard freeBoard = freeBoardRepository.findById(id).orElse();

//        freeBoardTailRepository.deleteByCustomBoard_Id(id);
        freeBoardRepository.deleteById(id);
        return "redirect:/freeboard";
    }

    @GetMapping("freeboard")
    public String freeboard(Model model){

        List<FreeBoard> list = freeBoardService.selectlist();

        model.addAttribute("list",list);

        return "freeboard/freeboard";
    }

    @GetMapping("freeboard/view")
    public String view(Long id, Model model, HttpServletRequest request)
    {
        System.out.println(request.getRemoteAddr());
        FreeBoard freeBoard = freeBoardRepository.findById(id).orElse(new FreeBoard());

        freeBoard.setHits(freeBoard.getHits()+1); //hits수 올리기
        freeBoardRepository.save(freeBoard); //자동으로 update구문 생성

        model.addAttribute("freeboard",freeBoard);
        return "freeboard/view";
    }

    @PostMapping("freeboard/view")
    public String pview(Long id, Model model, FreeBoardTailReq freeBoardTailReq)
    {
        FreeBoard freeBoard = freeBoardRepository.findById(id).orElse(new FreeBoard());

        freeBoardTailRepository.save(
                FreeBoardTail.builder()
                        .freeBoard(freeBoard)
                        .t_content(freeBoardTailReq.getT_content())
                        .t_name(freeBoardTailReq.getT_name())
                        .id(null)
                        .build()
        );

        model.addAttribute("freeboard",freeBoard);

        return "redirect:/freeboard/view?id="+id;
    }

    @GetMapping("freeboard/write")
    public String write(FreeBoardReq freeBoardReq, @RequestParam(required = false) String id) {
        System.out.println(id);
        /*
            id 값이 null이면
            insert 하는 상황
            id 값이 1dlaus
            update 하는 상황
         */
        try {
            if (id != null && !id.equals("")) {
                FreeBoard freeBoard
                        = freeBoardRepository.findById(Long.parseLong(id)).orElse(new FreeBoard());
                freeBoardReq.setTitle(freeBoard.getTitle());
                freeBoardReq.setContent(freeBoard.getContent());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return "freeboard/write";
    }

    @PostMapping("freeboard/write")
    public String pwrite(@Valid FreeBoardReq freeBoardReq,
                         BindingResult bindingResult,
                         @RequestParam("file")MultipartFile file,
                         @RequestParam(required = false) String id){

        if (bindingResult.hasErrors()){
            return "freeboard/write";
        }


        String fileName = file.getOriginalFilename();
        System.out.println(fileName);
        if( fileName !=null && !fileName.equals("")) {
            try {
                //D:\mhgit\springboot_work\20220811\org\src\main\resources\static\img
                //D:\mhgit\springboot_work\20220811\org\target\classes\static\img
                File file1 = new File("D:\\mhgit\\springboot_work\\220811\\org (1)\\org\\src\\main\\resources\\static\\img\\" + fileName);
                File newfile = new File("D:\\mhgit\\springboot_work\\220811\\org (1)\\org\\target\\classes\\static\\img\\" + fileName);

                file.transferTo(file1);

                Files.copy(file1.toPath(), newfile.toPath(), StandardCopyOption.REPLACE_EXISTING);
            } catch (Exception e) {
                e.printStackTrace();
                return "freeboard/write";
            }
        }

/*
        freeboardReq.getId()있으면
        save()함수 호출시에
 */     if (id != null && !id.equals("")) {
            freeBoardService.regist(
                    FreeBoard.builder()
                            .id(Long.parseLong(id))
                            .content(freeBoardReq.getContent())
                            .title(freeBoardReq.getTitle())
                            .regdate(LocalDateTime.now())
                            .filename(fileName)
                            .build()
            );
        }else {
            freeBoardService.regist(
                    FreeBoard.builder()
                            .content(freeBoardReq.getContent())
                            .title(freeBoardReq.getTitle())
                            .regdate(LocalDateTime.now())
                            .filename(fileName)
                            .build()
            );
        }



        return "redirect:/freeboard";
    }


}
