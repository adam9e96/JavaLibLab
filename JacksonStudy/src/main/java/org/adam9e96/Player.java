package org.adam9e96;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 이 클래스는 플레이어의 이름과 점수를 포함하며, Jackson 라이브러리를 사용하여 JSON 데이터와의 매핑을 지원합니다.
 * <p>
 * 이 클래스는 불변 객체로 설계되지 않았으며, 필드의 값을 변경할 수 있는 setter 메서드를 제공합니다.
 * </p>
 *
 * @author adam9e96
 * @version 1.0
 * @since 2024-12-27
 */
public class Player {

    /**
     * 플레이어의 이름을 나타내는 필드입니다.
     * 이 필드는 JSON의 "name" 속성과 매핑됩니다.
     */
    @JsonProperty("name")
    private String name;

    /**
     * 플레이어의 점수를 나타내는 필드입니다.
     * 이 필드는 JSON의 "score" 속성과 매핑됩니다.
     */
    @JsonProperty("score")
    private int score;

    /**
     * {@code Player} 클래스의 기본 생성자입니다.
     * Jackson 라이브러리는 객체를 역직렬화할 때 이 생성자를 사용합니다.
     * <p>
     * 기본 생성자는 빈 {@code Player} 객체를 생성합니다.
     * </p>
     */
    public Player() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Player{name='%s', score=%d}".formatted(name, score);
    }
}
