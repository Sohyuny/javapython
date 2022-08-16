package com.dip.org.req;

/*
유효성검사 validation
form 저장버튼을 눌렀을때
글의 내용, 글의 제목이 없을 시 다시 입력받고록 유도하는 기능
 */

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
@ToString
public class FreeBoardReq {

    private Long id;

    @NotEmpty
    private String title;
    @NotEmpty
    private String content;

    private String filename;
    private int hits;

    private String regdata;
}
