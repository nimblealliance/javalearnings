package com.rahul.practice;

public class Main {
	
	public static void main(String[] args) {
		
		FunctionalInterfaceExample functionalInterfaceExample = (a,b) -> (a+b);
		System.out.println(functionalInterfaceExample.add(10, 20));	
	}
}
