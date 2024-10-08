package com.example.yakbang.dto.admin;

import lombok.*;

@Getter @Setter @ToString
@NoArgsConstructor @AllArgsConstructor @Builder
public class AdminMemberDTO {
    private Long memberId;
    private String loginId;
    private String name;
    private String gender;
    private String birth;
    private String phoneNumber;
    private String email;
}
