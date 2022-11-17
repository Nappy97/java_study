package org.example.java_programming_language;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileEx2 {
    public static void main(String[] args) {
        try {
            RandomAccessFile raf = new RandomAccessFile("raf_file.dat", "rw");

            // write
            raf.writeInt(10);
            raf.writeChar('C');
            raf.writeLong(1010L);
            raf.writeByte(8);

            // read
            System.out.println(raf.readInt());
            System.out.println(raf.readChar());
            System.out.println(raf.readLong());
            System.out.println(raf.readByte());

        } catch (FileNotFoundException e) {
            e.getStackTrace();
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
}
