package org.example.java_programming_language;

import java.io.*;

public class BufferEx1 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        int i = Integer.parseInt(s) + 10;

        br.close();

        bw.write("입력받은 값 : " + s);
        bw.newLine();
        bw.write("입력받은 값 + 10: " + i + "\n");

        bw.flush();
        bw.close();

    }
}
