package org.example.java_programming_language;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {

    public static void main(String[] args) {
        java.lang.Object[] objArr = {"1", 1, "2", "2", "3", "3", "4", "4", "4"};
        Set set = new HashSet();

        for (int i = 0; i < objArr.length; i++) {
            set.add(objArr[i]);
        }

        System.out.println(set);
    }
}
