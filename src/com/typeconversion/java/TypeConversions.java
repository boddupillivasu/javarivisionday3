package com.typeconversion.java;

public class TypeConversions {

    public static void main(String[] args) {

        // implicit
        int value;
        value =100;

        System.out.println("the integer value before casting:"+value);

        double val;
        val = value;
        System.out.println("the double value after imlicit casting: "+val);

        double db = 100.00;
        System.out.println("the double value after before  casting: "+db);
        int val1 = (int) db;
        System.out.println("the integer value after the explisit type casting "+val1);


    }
}
