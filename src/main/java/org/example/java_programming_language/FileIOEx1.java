package org.example.java_programming_language;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class FileIOEx1 {
    public static void main(String[] args) {
        try {
            OutputStream output = new FileOutputStream("D:/U.C/devroot/java/txt/test2.txt");
            String str = "2022/11/17 test입니다";
            byte[] by = str.getBytes();
            output.write(by);
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
