package org.config;

import org.member.MemberDAO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.member"})
public class AppConfig {
	
//	@Bean
//	public MemberDAO memberDAO() {
//		return new MemberDAO();
//	}
	
//	@Bean
//	public MemberService memberService() {
//		return new MemberService(MemberService.class);	
//	}
	
	

}
