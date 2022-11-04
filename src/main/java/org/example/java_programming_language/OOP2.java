package org.example.java_programming_language;

public class OOP2 {
    public static void main(String[] args) {
        Card c1 = new Card();
        Card c2 = new Card();

        System.out.println("c1은 " + c1.width + "와, " + c1.height);
        System.out.println("c2는 " + c2.width + "와, " + c2.height);

        // c1의 클래스변수의 값을 바꾸려 시도
        c1.height = 50;
        c1.width = 100;

        System.out.println("c1은 " + c1.width + "와, " + c1.height);
        System.out.println("c2는 " + c2.width + "와, " + c2.height);

    }
}

class Card{
    String kind;
    int number;
    static int width = 100;
    static int height = 250;
}