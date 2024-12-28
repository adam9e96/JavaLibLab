package org.adam9e96;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * {@code Main} 클래스는 JSON 문자열을 {@code Player} 객체로 변환하고,
 * {@code Player} 객체를 다시 JSON 문자열로 직렬화하는 예제를 제공합니다.
 * 이 클래스는 Jackson 라이브러리를 사용하여 JSON 파싱을 수행합니다.
 * <p>
 * 실행 시, JSON 문자열을 {@code Player} 객체로 변환한 후 출력하고,
 * 해당 객체를 다시 JSON 문자열로 변환하여 출력합니다.
 * </p>
 *
 * @author adam9e96
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        // JSON 문자열 정의 (Java 15 이상의 텍스트 블록 사용)
        String json = """
                {
                "name": "Lux",
                "score": 100}
                """; // JSON 문자열

        // Jackson의 ObjectMapper 인스턴스 생성
        ObjectMapper objectMapper = new ObjectMapper();

        // JSON 파싱 및 객체 생성
        try {
            // JSON 문자열을 Player 객체로 변환 (역직렬화)
            Player player = objectMapper.readValue(json, Player.class);
            System.out.println(player); // 변환된 Player 객체 출력

            // Player 객체를 JSON 문자열로 변환 (직렬화)
            String jsonPlayer = objectMapper.writeValueAsString(player);
            System.out.println(jsonPlayer); // 직렬화된 JSON 문자열 출력

        } catch (Exception e) {
            // 예외 발생 시 스택 트레이스 출력
            e.printStackTrace();
        }
    }
}
