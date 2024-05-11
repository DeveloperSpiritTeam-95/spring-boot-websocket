package com.all.projects.concepts;

public class VariablesAndDataTypesInJava {
    public static void main(String[] args) {

      /* every variable must have naming convention
         if may any possibility to know the function based on naming gave on function.
         They are the building blocks of data manipulation and cannot be further divided into simpler data types.
         There are 8 Primitive data types in Java – Boolean, char, byte, int, short, long, float, and double.
       */

        // Here the possible values of Boolean Values are true or false
        boolean isPossible = true;
        boolean isImpossible = false;

        // Here the possible values of char to store single character
        // which is capital or small only one letter
        char firstLetter = 'p';
        char initialLetter = 'K';

        // Here byte can store only -126 t0 127 between of them rather than NA
        byte smallNumber = 10;
        byte bigNumber = 127;

        //Here short can store within 5-digit number format rather than NA
        short shortNumber = 12345;
        short bigShortNumber = 12345;

        // Here integer can store within 9-digit number format rather than not possible
        int number = 100;
        int mobileNumber = 709526240;

        /* Here long can store within 18 0r 19 digit
         with last bit is (L) or (l) recommend to go with capital one*/
        long initialLongNumber = 9652208340L;
        long targetLongNumber = 986745634657893234L;

        // if may possible to declare 75.8f (or) 75.8F
        float price = 75.8F;
        float bigPrice = 23475.9f;

        // Here double can store decimal values we use most of calc part in our logics
        double salary = 475827264.948;
        double salaryPackage = 379579374.484;

         /*String is not a primitive type data type. because it's a class
         Here String can store text which is a couple of characters
         we can store the paragraphs in single variable of string*/
        String name = "prabhakar";
        String statement = "This is prabhakar i develop this java concept to understand easy way of perceptions";


        // we can print all those values here for concern of beginners
        System.out.println("isPossible: "+isPossible);
        System.out.println("isImpossible: "+isImpossible);

        System.out.println("firstLetter: "+firstLetter);
        System.out.println("initialLetter: "+initialLetter);

        System.out.println("smallNumber: "+smallNumber);
        System.out.println("bigNumber: "+bigNumber);

        System.out.println("shortNumber: "+shortNumber);
        System.out.println("bigShortNumber: "+bigShortNumber);

        System.out.println("number: "+number);
        System.out.println("mobileNumber: "+mobileNumber);

        System.out.println("initialLongNumber: "+initialLongNumber);
        System.out.println("targetLongNumber: "+targetLongNumber);

        System.out.println("price: "+price);
        System.out.println("bigPrice: "+bigPrice);

        System.out.println("salary: "+salary);
        System.out.println("salaryPackage: "+salaryPackage);

        System.out.println("name: "+name);
        System.out.println("statement: "+statement);
    }
}
