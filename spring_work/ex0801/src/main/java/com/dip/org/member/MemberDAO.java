package com.dip.org.member;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;


@Component
public class MemberDAO {
	
	private Map<String, MemberDTO> datas = new HashMap();
	
	public void insert(MemberDTO memberDTO) {
		datas.put(memberDTO.getEmail(), memberDTO);
	}
	public Collection<MemberDTO> selectall(){
		return datas.values();
	}
}
