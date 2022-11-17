package org.example.java_programming_language;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileEx1 {
    public static void main(String[] args) {

        try {
            RandomAccessFile raf = new RandomAccessFile("raf_file.dat", "rw");
            System.out.println("position: " + raf.getFilePointer());

            raf.writeInt(10);
            System.out.println("position: " + raf.getFilePointer());

            raf.writeChar('C');
            System.out.println("position: " + raf.getFilePointer());

            raf.writeLong(1010L);
            System.out.println("position: " + raf.getFilePointer());

            raf.writeByte(8);
            System.out.println("position: " + raf.getFilePointer());

            raf.close();
        } catch (FileNotFoundException e) {
            e.getStackTrace();
        } catch (IOException e) {
            e.getStackTrace();
        }

    }
}
