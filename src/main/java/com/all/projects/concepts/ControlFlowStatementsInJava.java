package com.all.projects.concepts;

public class ControlFlowStatementsInJava {
    public static void main(String[] args) {

        // ControlFlows every time checks conditions. values must accept true or false
        //if there is only one condition execute if block when the condition true
        boolean condition = 5 > 4;
        if (condition)
            System.out.println("5>4 "+condition);

        // if there is a possibility to check the condition with two blocks yes.
        // if the condition go with true condition it will execute if block or else block
        condition = 5 > 6;
        if (condition)
            System.out.println("5 > 6 "+condition);
        else
            System.out.println("5 > 6 condition not "+condition);

        // if we have more than one condition. then will execute the functionality in two ways
        condition = 10 ==10;
        boolean condition1 = 10 !=10;
        if (condition)
            System.out.println("10 ==10 "+condition);
        else if (condition1)
            System.out.println("10 !=10 "+condition1);
        else
            System.out.println("above both conditions false");

        // we have next control-flow statements called nested conditions
        // if there is a possible condition move into if block then the another condition
        // there is inside another block like below

        int age = 10; // change values you can observe execution
        char gender = 'F';  // like age 20, gender M
        if (gender == 'M'){
            if (age>18)
                System.out.println("your gender "+gender+" age "+age);
        }else {
            if (gender == 'F') {
                if (age < 18)
                    System.out.println("your gender " + gender + " age " + age);
            }
        }

    }
}
