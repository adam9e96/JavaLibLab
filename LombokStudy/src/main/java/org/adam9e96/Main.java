package org.adam9e96;

import lombok.Builder;
import lombok.Data;
import lombok.val;

public class Main {
    public static void main(String[] args) {

        val message = "Hello, Lombok!";
//         message = "새 메시지"; // 오류: final 변수에 값을 재할당할 수 없음
        System.out.println(message);

        var count = 10; // int 타입으로 추론
        count = 20; // 재할당 가능
        System.out.println(count);

        // Player 객체 생성
        // @val 사용
        val player1 = Player.builder()
                .name("홍길동")
                .age(20)
                .build();
        System.out.println(player1);


//        testGetterAndSetter();
//        testGetterAndSetterAndToString();
//        testGetterAndSetterAndToStringAndEqualsAndHashCode();
//        testNoArgsConstructor();
//        testAllArgsConstructor();
//        testRequiredArgsConstructor();
//        testValue();

    }

    // User1: User(id=1, name=홍길동, TomHanks99996@gmail.com)
    static void testGetterAndSetter() {
        Member member = new Member();
        member.setId(1);
        member.setName("홍길동");
        member.setEmail("TomHanks99996@gmail.com");
        System.out.printf("member1: %s%n", member);
    }

    // User2: User(id=1, name=홍길동, TomHanks99996@gmail.com)
    static void testGetterAndSetterAndToString() {
        Member2 member = new Member2();
        member.setId(1);
        member.setName("홍길동");
        member.setEmail("TomHanks99996@gmail.com");
        System.out.printf("member2: %s%n", member);
    }

    static void testGetterAndSetterAndToStringAndEqualsAndHashCode() {
        Member3 member = new Member3();
        member.setId(1);
        member.setName("홍길동");
        member.setEmail("TomHanks99996@gmail.com");
        System.out.println(member.hashCode());
        System.out.println(member.equals(member));
    }

    static void testNoArgsConstructor() {
        Member4 member = new Member4();
        member.setId(1);
        member.setName("홍길동");
        member.setEmail("Tom@gmail.com");

        System.out.println(member);
    }

    static void testAllArgsConstructor() {
        Member5 member = new Member5(1, "홍길동", "TomTom@gmail.com");
        member.setId(2);
        System.out.println(member);
    }

    static void testRequiredArgsConstructor() {
        Member6 member = new Member6(1, "홍길동", "tt@gmail.com");
        member.setPhone("010-1234-5678");
        System.out.println(member);
    }

    static void testValue() {
        // 객체 생성
        LeagueOfLegends lol1 = new LeagueOfLegends("티모", "Mage", 15, 50.5);
        LeagueOfLegends lol2 = new LeagueOfLegends("이즈리얼", "AD", 10, 52.5);

        // getter 메서드를 사용하여 필드 접근
        System.out.printf("Champion: %s%n", lol1.getChampion());
        System.out.printf("Role: %s%n", lol1.getRole());
        System.out.printf("Level: %d%n", lol1.getLevel());
        System.out.printf("Win Rate: %s%%%n", lol1.getWinRate());

        // toString() 메서드 사용
        System.out.println(lol1);
        System.out.println(lol2);

        // equals() 메서드 사용
        LeagueOfLegends lol3 = new LeagueOfLegends("Ahri", "Mage", 30, 52.5);
        System.out.printf("lol1 equals lol3: %s%n", lol1.equals(lol3));
        System.out.printf("lol1 equals lol2: %s%n", lol1.equals(lol2));

        // hashCode() 메서드 사용
        System.out.printf("lol1 hashCode: %d%n", lol1.hashCode());
        System.out.printf("lol3 hashCode: %d%n", lol3.hashCode());
        System.out.printf("lol2 hashCode: %d%n", lol2.hashCode());

        LeagueOfLegends lol4 = new LeagueOfLegends("Lux", "Support", 25, 55.0);

        // 시도: 필드 값을 변경하려고 함
        // 아래의 코드는 컴파일 오류를 발생시킵니다.
//        lol4.champion = "Sona"; // 오류: final 필드에 값을 할당할 수 없음

        // 필드 변경 시도
        System.out.println(lol4.getChampion().replace("L", "S")); // 가능하지만, lol 객체 자체는 변경되지 않음

        // 객체의 불변성 확인
        System.out.println(lol4);

    }

}

@Data
@Builder
class Player {
    private String name;
    private int age;
}
