package org.example.java_programming_language;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileIOEx2 {
    public static void main(String[] args) {
        try {
            File file = new File("D:/U.C/devroot/java/txt/test1.txt");
            FileReader fileReader = new FileReader(file);
            int cur = 0;
            while ((cur = fileReader.read()) != -1) {
                System.out.print((char) cur);
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.getStackTrace();
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
}
