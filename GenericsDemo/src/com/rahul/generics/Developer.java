package com.rahul.generics;

public class Developer {
    String name;

    public Developer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                '}';
    }
}
