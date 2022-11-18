package org.example.java_programming_language;

public class Asynchro {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            method1();
        });
        Thread t2 = new Thread(() -> {
            method2();
        });
        Thread t3 = new Thread(() -> {
            method3();
        });

        t.start();
        t2.start();
        t3.start();
    }

    public static void method1() {
        System.out.println("method1");
    }

    public static void method2() {
        System.out.println("method2");
    }

    public static void method3() {
        System.out.println("method3");
    }
}
