package org.example;

import org.springframework.beans.factory.annotation.Autowired;

public class MemberService {

    @Autowired
    private MemberDAO memberDAO;
    @Autowired
    private MemberPrinter memberPrinter;

    public void regist(MemberDTO dto) throws Exception{
//        System.out.println(dto);
        String result = memberDAO.getSelectByEmail(dto.getEmail());
        if (result.equals("have"))
            throw new Exception();
        else
            memberDAO.insert(dto);
    }

    public void list() {
        memberDAO.selectAll();
    }
}
