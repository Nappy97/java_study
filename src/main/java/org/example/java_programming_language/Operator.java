package org.example.java_programming_language;

import java.util.Scanner;

// 조건연산자임
public class Operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 x를 입력해주세요");
        int x = sc.nextInt();

        System.out.println("숫자 y를 입력해주세요");
        int y = sc.nextInt();

        boolean result;

        result = (x > y) ? true : false;
        System.out.println("x(" + x + ") > y(" + y + ") 의 결과는: " + result);


    }
}
