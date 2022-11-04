package org.example.java_programming_language;

// return
public class OOP3 {

    public static void main(String[] args) {
        printGugudan(5);
    }

    static void printGugudan(int dan){
        for(int i=1;i<=9;i++){
            System.out.printf("%d * %d = %d%n",dan,i,dan*i);
        }
        return;
    }
}




