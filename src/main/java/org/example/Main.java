package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class Main {


    public static void main(String[] args) {
        System.out.println("Hello world!");

        List list = new ArrayList();
        List checkedList = Collections.checkedList(list, String.class);
        checkedList.add("abc"); // ok
        checkedList.add(1); // error


    }
}