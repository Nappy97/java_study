package org.example.java_programming_language;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {

        int i,j;

        String[][] arr = new String[5][2];

        Scanner sc = new Scanner(System.in);

        for(i=0; i<arr.length; i++){
            for(j=0; j<arr[i].length; j++){
                System.out.println(i+"행"+j+"열"+"한글 / 영어를 입력하세요");
                arr[i][j] = sc.nextLine();
            }
        }

        for (i = 0; i < arr.length; i++) {
            System.out.printf("Q%d. %s 의 영어는?", i+1, arr[i][0]);

            String tmp = sc.nextLine();

            if (tmp.equals(arr[i][1])){
                System.out.printf("정답. %n%n");
            } else {
                System.out.printf("오답. 정답은 %s 입니다. %n%n", arr[i][1]);
            }
        }
    }
}
