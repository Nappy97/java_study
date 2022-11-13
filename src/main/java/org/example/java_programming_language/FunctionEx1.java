package org.example.java_programming_language;

import java.util.function.Function;

public class FunctionEx1 {

    static Function<String, Integer> f = (s) -> Integer.parseInt(s, 16);
    static Function<Integer, String> g = (i) -> Integer.toBinaryString(i);
    static Function<String, String> h = f.andThen(g);

    public static void main(String[] args) {
        System.out.println(h.apply("FF"));
    }

}

