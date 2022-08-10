package com.dip.myapp.member;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {

	@Autowired
	MemberService memberService;

	@Autowired
	SqlSessionTemplate sql;
	
	@GetMapping("insert")
	public String insert() {
		memberService.regist(new MemberDto("aa@naver.com","우영우","1234"));
		memberService.regist(new MemberDto("aabb@naver.com","최수연","1234"));
		System.out.println("insert");
		return "insert";
	}
	
	@GetMapping("select")
	public String select() {
		System.out.println(sql.selectList("member.selectall"));
		return "select";
	}
}
