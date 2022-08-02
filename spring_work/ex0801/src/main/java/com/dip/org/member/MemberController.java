package com.dip.org.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MemberController {
	
	@Autowired
	MemberService memberService;
	
	@GetMapping("/memberinsert")
	@ResponseBody
	public String memberinsert() {
		memberService.newMember(new MemberDTO("우영우"," aa@naver.com", "1234"));
		return "inserted";
	}
	
	@GetMapping("/memberselect")
	@ResponseBody
	public String memberselect() {
		memberService.printMember();
		return "select";
	}
}
