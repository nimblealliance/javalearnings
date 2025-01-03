package com.rahul.generics;

public class GenericsDemo<T> {

    T info;

    public GenericsDemo(T info) {
        this.info = info;
    }

    public T getInfo() {
        return info;
    }
}
