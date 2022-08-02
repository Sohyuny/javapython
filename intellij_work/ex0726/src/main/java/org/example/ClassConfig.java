package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import(ImportConfig.class)
public class ClassConfig {

    @Autowired
    private MemberDAO memberDAO;

    @Autowired
    private MemberPrinter memberPrinter;

    @Bean
    public MemberService memberService(){
        MemberService ms = new MemberService();
        return ms;
    }
}