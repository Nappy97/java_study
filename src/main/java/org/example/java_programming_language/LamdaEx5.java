package org.example.java_programming_language;

public class LamdaEx5 {
    static void aMethod(MyFunction1 f) {
        f.myMethod();
    }

    public static void main(String[] args) {
        MyFunction1 f = () -> System.out.println("람다식을 이용한 myMEthod()");
        aMethod(f);
    }
}

@FunctionalInterface
interface MyFunction1 {
    void myMethod();
}

