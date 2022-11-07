package org.example.java_programming_language;

public class GenericEx1 {

    java.lang.Object item;

    void setItem(java.lang.Object item) {
        this.item = item;
    }

    java.lang.Object getItem() {
        return item;
    }
}

class Box1<T>{
    T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
