package org;

import org.config.AppConfig;
import org.member.MemberDTO;
import org.member.MemberService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainController {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(AppConfig.class);

		acac.close();
		
		MemberService ms = acac.getBean(MemberService.class);
		
		ms.newMember(new MemberDTO("우영우","aa@naver.com","1234"));
		ms.newMember(new MemberDTO("최수연","bbaa@naver.com","1234"));
		ms.newMember(new MemberDTO("동그라미","ccaa@naver.com","1234"));

		ms.printMember();
		
		acac.close();
	}

}
