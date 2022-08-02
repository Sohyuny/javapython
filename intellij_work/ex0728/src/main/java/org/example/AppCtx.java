package org.example;

import org.springframework.contest.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class AppCtx {

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    @Configuration
    public static class AppCtx {

        @Bean
        public MemberService memberService(){
            return new MemberService();
        }

//        @Bean
//        public MemberDAO memberDAO(){
//            return new MemberDAO();
//        }
    }
}