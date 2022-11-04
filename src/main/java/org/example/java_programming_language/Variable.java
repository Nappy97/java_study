package org.example.java_programming_language;

//import java.lang.Math.*;

class Book implements Cloneable {
    String name;
    int price;

    @Override
    public Object clone() {
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
        }
        return obj;
    }
}