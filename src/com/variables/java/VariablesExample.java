package com.variables.java;

public class VariablesExample {

    //variables are named  storage location and hold the data

    /*
    they are classified in three types
    1. instance variables:- these are before main and below the class assigned with object ref
    2.static variables:- these are declare with static key word and assigned with class ref
    3.loacal variable :- these are inside the main and also constructor and methods
     */

    // instance variables

    String name ;

    // static variables

    static  int value;

    static  double number = 100.00;

    public void method(){
        // local variables

        int id = 1000;
        System.out.println("the instance variable is:"+name);
        System.out.println("the static avriable is:"+number);
        System.out.println("the local variable is:"+id);
    }

    public static void main(String[] args) {
        VariablesExample variablesExample;
        variablesExample = new VariablesExample();

        VariablesExample variablesExample1;
        variablesExample1 = new VariablesExample();

        variablesExample.name="vasu";
        variablesExample1.name="bharath";

        VariablesExample.value =100;
        VariablesExample.number= 10;
        System.out.println("the instance variable is:"+variablesExample.name);
        System.out.println("the static avriable is:"+VariablesExample.number);
        System.out.println("the static variable is:"+variablesExample1.name);
        System.out.println("the static variable is:"+variablesExample1.value);



        variablesExample.method();



    }

}
