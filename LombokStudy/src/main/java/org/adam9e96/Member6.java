package org.adam9e96;

import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * <h2>
 * RequiredArgsConstructor를 사용한 Member6 클래스
 * </h2>
 * RequiredArgsConstructor는 final이나 @NonNull인 필드 값만 파라미터로 받는 생성자를 생성합니다.
 * 이 어노테이션을 사용하면 불변 객체(immutable object)를 쉽게 만들 수 있으며, 필요한 필드만을
 * 초기화하는 생성자를 만들 수 있습니다.
 */
@RequiredArgsConstructor
@ToString
@Setter
public class Member6 {
    private final int id;
    private final String name;
    private final String email;
    private String phone; // final이 아니므로 생성자에 포함되지 않습니다.
    // private final String phone; // final이므로 생성자에 필수로 초기화가 필요합니다.
}
