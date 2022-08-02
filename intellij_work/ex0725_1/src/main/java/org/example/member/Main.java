package org.example.member;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
public class Main {

    public static Map<String, MemberDTO> memberlist =
            new HashMap<>();
    private static AnnotationConfigApplicationContext ctx = null;

    public static void main(String[] args) throws Exception {
        ctx = new AnnotationConfigApplicationContext(Config.class);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        MemberDTO md = new MemberDTO("aa@naver.com","우영우","1234");
        memberlist.put("우영우",md);

        MemberDTO md1 = new MemberDTO("bb@naver.com","최수연","1234");
        memberlist.put("최수연",md1);

        System.out.println("1. 회원가입 new aaa@naver.com 이름 1234");
        System.out.println("2. 회원리스트 list");
        System.out.println("3. 회원삭제 del 이름");
        System.out.println("4. 종료 exit");

        while (true) {
            String command = br.readLine();
            if (command.equalsIgnoreCase("exit")){
                System.out.println("프로그램 종료합니다");
                break;
            }
            else if (command.startsWith("new ")){
                String name = command.split(" ")[1];
                MemberDTO md2 = new MemberDTO("bb@naver.com",name,"1234");
                memberlist.put(name,md2);
                System.out.println("등록되었습니다.");
                //hashmap 안에 넣을 예정
            }
            else if (command.equalsIgnoreCase("list")){
                MemberDAO dao = ctx.getBean(MemberDAO.class);
                Collection<MemberDTO> collection = dao.selectAll();
                collection.forEach(m-> System.out.println(m));
            }
        }


//
//        System.out.println(memberlist);
    }
}
