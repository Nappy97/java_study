package org.example.java_programming_language;

import java.awt.*;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputOutputEx1 {

    public static void main(String[] args) throws IOException {

        // InputStream 로 입력받는 경우 맨 앞 문자 1개만 출력됨 && int 형태로 입력받음
        InputStream in = System.in;
        OutputStream out = System.out;

        int idata = in.read();  // input 은 read 와 연결되어있지 않기 때문에 in.read를 사용

        out.write(idata);   // output 은 write와 연결되어 있지 않기 때문에 out.write 사용
        out.flush();        // flush 를 써주지 않으면 출력되지 않음
        out.close();        // output 을 끝내는 메서드
    }
}