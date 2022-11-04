package org.example.java_programming_language;

import java.util.Scanner;

// equals
public class Object1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("문자열을 입력해주세요");
        String a = sc.nextLine();

        System.out.println("문자열을 입력해주세요");
        String b = sc.nextLine();

        System.out.println("a와 b는 같나요?" + a.equals(b));
    }
}
