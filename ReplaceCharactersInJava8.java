package com.demo;

public class ReplaceCharactersInJava8 {

	public static void main (String [] args) {
	String name="Work in Capgemini";
	String replace="in";

	name=name.replaceAll("["+replace+"]", "");
	System.out.println(name);
	}
	}

