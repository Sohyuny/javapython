package org.example;


public class MemberService {

    private MemberDao memberDao;

    public void regist(){
        memberDao.insert();
    }
    public void getall(){
        memberDao.selectall();
    }
}
