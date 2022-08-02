package org.example;

import org.springframework.context.annotation.AnnotationConfigApplication

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        AnnotationConfigApplicationContext acac=new AnnotationConfigApplicationContext(AppCtx.class);

        MemberService ms=acac.getBean(MemberService.class);
        ms.regist();
        ms.getall();

        ChangePwdservice cs=acac.getBean(ChangePwdservice.class);
        cs.chpwd();

        acac.close();
    }
}
