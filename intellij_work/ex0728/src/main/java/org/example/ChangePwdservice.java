package org.example;

public class ChangePwdservice {

    private MemberDao memberDao;

    public void chpwd(){
        memberDao.update();
    }
}
