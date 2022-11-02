package org.example.java_programming_language;

import java.util.Scanner;

public class Operator2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("매월 투자금액");
        int amount = sc.nextInt();

        System.out.println("투자기간을 입력해주세요 ex) 1년 -> 12, 6개월 -> 6");
        int period = sc.nextInt();

        System.out.println("연이율을 입력해주세요");
        System.out.println("ex: 9.1");
        double x = sc.nextDouble();

        double interest = amount * period * (x / 100) * (period / 12) / 2;
        System.out.println("세전이자:" + interest);

        int total = amount * period;
        int total_amount = (int) interest + total;
        System.out.println("획득예정?: " + total_amount + "원");

        String result;

        result = (total_amount / total > 1.25) ? "당장 적금들자" : "안전이 목표가 아니라면 다른 투자처를 찾아볼까요?";
        System.out.println(result);


    }
}
