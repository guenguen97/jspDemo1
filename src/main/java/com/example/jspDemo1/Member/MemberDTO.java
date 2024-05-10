package com.example.jspDemo1.Member;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class MemberDTO {
    private Integer id;
    private String name;
    private String loginID;
    private String password;
    private String email;
    private LocalDateTime createDate;
    private LocalDateTime updateDate;
}
