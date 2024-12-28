package org.adam9e96;

import lombok.*;


/**
 * <h2>
 * NoArgsConstructor를 사용한 Member4 클래스
 * </h2>
 * NoArgsConstructor는 기본 생성자를 생성합니다.
 * public Member4() {}
 */
@Getter
@Setter
@ToString
//@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Member5 {
    private int id;
    private String name;
    private String email;

}
