package com.all.projects.concepts;

public class OperatorsAndLogicsInJava {
    public static void main(String[] args) {

        int result = 5 + 3;  // Addition
        boolean isTrue = (result > 5) && (result < 10);  // Logical AND Operator
        System.out.println(result+" >5 && <10 "+ isTrue);

        isTrue = (result > 10) && (result < 12);
        System.out.println(result+" >10 && <12 "+isTrue);

        result = 10-5;      // Subtraction
        isTrue = (result > 5 || result < 6); //Logical OR Operator
        System.out.println(result+" >5 || <6 "+isTrue);

        isTrue = (result > 5 || result < 5);
        System.out.println(result+" >5 || <5 "+isTrue);

        result = 20/6;      // Division
        System.out.println(result);

        result = 14%3;      // Remainder
        System.out.println(result);

    }
}
