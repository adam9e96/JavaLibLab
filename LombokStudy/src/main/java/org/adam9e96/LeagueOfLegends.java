package org.adam9e96;

import lombok.Value;

/**
 * <h2>
 * Value를 사용한 LeagueOfLegends 클래스
 * </h2>
 * Value는 불변 객체(immutable object)를 만들 때 사용합니다.
 * Value는 final 필드로만 구성된 클래스를 만들 때 사용합니다.
 * Value는 @Getter, @ToString, @EqualsAndHashCode, @AllArgsConstructor를 포함합니다.
 */
@Value
public class LeagueOfLegends {
    String champion;
    String role;
    int level;
    double winRate;
}
