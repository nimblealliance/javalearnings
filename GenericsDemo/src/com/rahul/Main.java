package com.rahul.generics;

public class Main {
    public static void main(String[] args) {

        GenericsDemo<String> Engineer1 = new GenericsDemo<String>("Software developer");
        System.out.println(Engineer1.getInfo());

        GenericsDemo<Integer> Engineer1_age = new GenericsDemo<Integer>(30);
        System.out.println(Engineer1_age.getInfo());

        Developer rahul = new Developer("Rahul Menon");
        System.out.println(rahul);

        GenericsDemo<Developer> Engineer2 = new GenericsDemo<Developer>(rahul);
        System.out.println(Engineer2.getInfo());

    }
}