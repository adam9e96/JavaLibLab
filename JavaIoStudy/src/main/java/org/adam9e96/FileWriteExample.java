package org.adam9e96;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteExample {
    public static void main(String[] args) {
        String filePath = "example.txt";
        String content = "Hello, World!";

        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(content);
            System.out.println("파일이 생성되었습니다.");
        } catch (IOException e) {
            System.err.println("파일 생성 중 오류가 발생했습니다." + e.getMessage());
        }
    }
}
