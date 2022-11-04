package org.example.java_programming_language;

import java.util.Arrays;
import java.util.Scanner;

// 조건식
public class IfSwitch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("신용평가점수를 입력해주세요! (100점만점기준)");
        int grade = sc.nextInt();

        System.out.println("얼마나 원해요? (1000만원 -> 1000)");
        int borrow = sc.nextInt();

        char grade1;
        int ascii;
        String value;

        final String fail = "대출불가";

        String result = null;
        String able[][] = {
                {"90점이상", "1000만원"},
                {"80점이상", "900만원"},
                {"70점이상", "800만원"},
                {"60점이상", "700만원"},
                {"그 미만", "X"}
        };

        if (grade >= 90) {
            grade1 = 'A';
            ascii = grade1;
        } else if (grade >= 80) {
            grade1 = 'B';
            ascii = grade1;
        } else if (grade >= 70) {
            grade1 = 'C';
            ascii = grade1;
        } else if (grade >= 60) {
            grade1 = 'D';
            ascii = grade1;
        } else {
            grade1 = 'F';
            ascii = grade1;
        }

        if (borrow >= 1000) {
            value = borrow + "만원 대출신청";
            if (ascii >= 66) {
                result = fail;
            }
        } else if (borrow >= 900) {
            value = borrow + "만원 대출신청";
            if (ascii >= 67) {
                result = fail;
            }
        } else if (borrow >= 800) {
            value = borrow + "만원 대출신청";
            if (ascii >= 68) {
                result = fail;
            }
        } else if (borrow >= 700) {
            value = borrow + "만원 대출신청";
            if (ascii >= 69) {
                result = fail;
            }
        } else {
            value = borrow + "만원 대출신청";
            if (ascii == 70){
                result = fail;
            }
        }

        System.out.println("고객님의 신용등급은 " + grade + "(" + grade1 + ") 이며," );
        System.out.println("신청금액은 " + value + "입니다.");

        if (result == fail) {
            System.out.println(Arrays.deepToString(able));
        } else {
            System.out.println("대출 승인을 축하드립니다.");
        }

    }
}
