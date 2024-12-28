package org.adam9e96;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * <h2>
 * Getter, Setter, ToString, EqualsAndHashCode 을 사용한 Member3 클래스
 * </h2>
 * equals() 와 hashCode() 메소드를 자동으로 생성하여 객체 간의 동등성을 비교할 수 있습니다.
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Member3 {
    private int id;
    private String name;
    private String email;
}
