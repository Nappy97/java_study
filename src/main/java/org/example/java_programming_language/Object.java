package org.example.java_programming_language;

import java.util.Objects;

// equals()
public class Object {

    public static void main(String[] args) {
        String aa = null;
        String bb = null;
        if (Objects.equals(aa, bb)) {
            // ...
        }
        System.out.println("Objects.equals(null, null): " + Objects.equals(aa, bb));

        aa = "google";
        bb = "google";
        System.out.println("Objects.equals(google, google): " + Objects.equals(aa, bb));

        aa= "android";
        bb = "google";
        System.out.println("Objects.equals(android, google): " + Objects.equals(aa, bb));
    }
}
