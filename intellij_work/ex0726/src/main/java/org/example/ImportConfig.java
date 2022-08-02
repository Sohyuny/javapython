package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ImportConfig {

    @Bean
    public MemberDAO memberDAO() {return new MemberDAO();}
    @Bean
    MemberPrinter memberprinter(){
        return new MemberPrinter("1.0");
    }
}
