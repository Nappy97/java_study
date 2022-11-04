package org.example;

import java.util.Arrays;

public class Main {

    void method(int n) {
        if (n == 0)
            return;
        System.out.println(n);

        method(--n);
    }
}