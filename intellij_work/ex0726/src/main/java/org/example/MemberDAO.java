package org.example;

import java.util.HashMap;
import java.util.function.Consumer;

public class MemberDAO {

    public static HashMap<String,MemberDTO> data = new HashMap<>();

    public void selectAll() {
        System.out.println("[data 출력 start]");
        if (data.size()==0) System.out.println("data 내용없음");
        data.values().forEach(memberDTO -> System.out.println(memberDTO));
        System.out.println();
    }


    public void insert(MemberDTO dto) {
        data.put(dto.getEmail(),dto);
    }

    public String getSelectByEmail(String email) {
        MemberDTO dto = data.get(email);
        if (dto != null)
            return "have";
        else
            return "donthave";
    }
}