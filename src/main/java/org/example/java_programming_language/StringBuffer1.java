package org.example.java_programming_language;

public class StringBuffer1 {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("test1");
        StringBuffer sb2 = new StringBuffer("test1");

        if (sb.equals(sb2)) {
            System.out.println("같음");
        } else {
            System.out.println("다름");
        }

        String str1 = sb.toString();
        String str2 = sb2.toString();
        if (str1.equals(str2)) {
            System.out.println("같음");
        } else {
            System.out.println("다름");
        }
    }
}
