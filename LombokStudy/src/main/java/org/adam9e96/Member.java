package org.adam9e96;

import lombok.Getter;
import lombok.Setter;


/**
 * <h2>
 * Getter, Setter를 사용한 Member 클래스
 * </h2>
 * <p>
 */
@Getter
@Setter
public class Member {
    private int id;
    private String name;
    private String email;

    @Override
    public String toString() {
        return "Member{id=%d, name='%s', email='%s'}".formatted(id, name, email);
    }
}
