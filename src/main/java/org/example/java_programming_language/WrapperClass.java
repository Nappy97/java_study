package org.example.java_programming_language;

public class WrapperClass {

    public static void main(String[] args) {
        Integer num = new Integer(17);      // 박싱
        int n = num.intValue();                     // 언박싱
        System.out.println(n);

        Integer num1 = 17;                          // 자동박싱
        int n1 = num1;                               // 자동 언박싱
        System.out.println(n1);
    }
}
