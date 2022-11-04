package org.example.java_programming_language;

public class Object3 {

    public static void main(String[] args) {
        String a = "FB";
        String b = "Ea";
        String c = new String("FB");
        String d = "FB";

        System.out.println(a == b);     // false
        System.out.println(a.hashCode() == b.hashCode());   // true
        System.out.println(a.equals(b));    // false

        System.out.println();

        System.out.println(a == c);     // false
        System.out.println(a.hashCode() == c.hashCode());   // ture
        System.out.println(a.equals(c));    // true

        System.out.println();

        System.out.println(a == d);     // true
        System.out.println(a.hashCode() == d.hashCode());   // true
        System.out.println(a.equals(d));    // true
    }

}
