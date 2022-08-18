package com.dip.org.service;

import com.dip.org.entity.FreeBoard;
import com.dip.org.entity.Member;
import com.dip.org.respository.MemberRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class MemberService {

    @Autowired
    MemberRepository memberRepository;

    public void regist(Member member) {
        member.setRegdate(LocalDateTime.now());
        memberRepository.save(member);
    }

    public List<Member> selectlist(){
        return memberRepository.findAll();
    }
}