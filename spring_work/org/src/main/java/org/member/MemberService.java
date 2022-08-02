package org.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberService {
	
	@Autowired
	private MemberDAO memberDAO;
	
	public void newMember(MemberDTO memberDTO) {
		// 해당되는 email이 존재하는지 확인
		// 없으면 data 추가
		// 있으면 data 넣을수 없다 이미 중복
		
		// 있는지 확인 하는 메서드
//		memberDAO.getSelectByEmail(memberDTO.getEmail());
		// 추가하는 메서드
		memberDAO.insert(memberDTO);
	}
	
	public void printMember() {
		memberDAO.selectall().forEach(m -> System.out.println(m));
	}


}
