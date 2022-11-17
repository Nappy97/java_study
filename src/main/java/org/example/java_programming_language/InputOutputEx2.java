package org.example.java_programming_language;

import java.io.*;

public class InputOutputEx2 {

    public static void main(String[] args) throws IOException {

        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);

        OutputStream out = System.out;
        OutputStreamWriter writer = new OutputStreamWriter(out);

        char cdata[] = new char[2];
        reader.read(cdata);

        int IcData = cdata[0] - '0';

        writer.write("입력받은 값: ");
        writer.write(cdata);
        writer.write("\n");
        writer.write("입력받은 첫번째 값 + 10 : ");
        writer.write(IcData + 10 + "\n");

        System.out.println("결과");
        writer.flush();
        writer.close();
    }
}
