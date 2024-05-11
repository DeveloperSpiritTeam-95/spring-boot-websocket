package com.all.projects.concepts;

public class MethodsInJava {

    //methods in java for reusable concept
    public static void printMessage() {
        System.out.println("This is printMessage() method.");
    }

    // we can write methods for specific functionality.
    public static String printMms() {
        return "This is printMMS() method";
    }

    // it will accept the syntax base on java rules as well what will define
    public String printName(String name) {
        name = "This is " + name;
        return name;
    }

    // some conditions are there in methods concept in java.
    // we 'll learn on oops concept
    public void printAddition() {
        int a = 10, b = 40;
        System.out.println("Addition: " + (a + b));
    }

    // methods accept common naming convention but different params
    public int printAddition(int a, int b) {
        return a + b;
    }

    // these are some examples on methods
    public static void main(String[] args) {

        printMessage();
        String mms = printMms();
        System.out.println(mms);

        // Here the Class and objects for accessing the related variables and methods
        // which is belongs to the class
        MethodsInJava methods = new MethodsInJava();
        String name = methods.printName("prabhakar");
        System.out.println(name);

        methods.printAddition();
        int addition = methods.printAddition(23, 45);
        System.out.println(addition);

    }
}
