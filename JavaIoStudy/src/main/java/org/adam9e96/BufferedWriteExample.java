package org.adam9e96;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriteExample {
    public static void main(String[] args) {
        String filePath = "buffered_example.txt";
        String[] lines = {
                "첫 번째 줄",
                "두 번째 줄",
                "세 번째 줄"
        };

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (String line : lines) {
                writer.write(line);
                writer.newLine(); // 줄 바꿈 추가
            }
            System.out.println("버퍼를 사용하여 파일에 성공적으로 작성되었습니다.");
        } catch (IOException e) {
            System.err.println("파일 작성 중 오류 발생: " + e.getMessage());
        }
    }
}