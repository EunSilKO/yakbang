package com.example.yakbang.dto.admin;

import lombok.*;

import java.time.LocalDate;

@Getter @Setter @ToString
@NoArgsConstructor @AllArgsConstructor
public class AdminReviewDTO {
    private Long reviewId;
    private Long pillId;
    private Long memberId;
    private int point;
    private int avgPoint;
    private LocalDate createDate;
    private LocalDate modifiedDate;
    private String reviewTitle;
    private String reviewContent;
    private String reviewGender;
    private String reviewShape;
    private int reviewAge;
    private String companyName;
    private String pillName;
    private String loginId;
    private String name;
}
