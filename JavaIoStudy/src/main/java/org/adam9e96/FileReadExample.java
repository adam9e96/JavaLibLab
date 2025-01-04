package org.adam9e96;

import java.io.FileReader;
import java.io.IOException;

public class FileReadExample {
    public static void main(String[] args) {
        String filePath = "example.txt";
        StringBuilder contentBuilder = new StringBuilder();

        try (FileReader reader = new FileReader(filePath)) {
            int ch;
            while ((ch = reader.read()) != -1) {
                contentBuilder.append((char) ch);
            }
            System.out.println("파일 내용:");
            System.out.println(contentBuilder.toString());
        } catch (IOException e) {
            System.err.println("파일 읽기 중 오류 발생: " + e.getMessage());
        }
    }
}
