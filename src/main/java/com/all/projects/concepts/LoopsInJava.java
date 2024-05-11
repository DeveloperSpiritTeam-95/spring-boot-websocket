package com.all.projects.concepts;

public class LoopsInJava {
    public static void main(String[] args) {

        // we have 4 types of loops in java
        // 1. while loop, 2. do-while loop, 3. for loop, 4. forEach loop

        // if we don't know where we want stop the loop the only choose while loop in any programming language
        System.out.println("while loop: ");
        int num =1;
        while(num<=10){
            System.out.println(num);
            num++;
        }

        // if any condition execute before one task is completed in do-while
        System.out.println("do-while loop: ");
        num = 1;
        do {
            System.out.println(num);
            num++;
        }while (num<=10);

        // most of the time we are using for loop functionality in real time scenarios
        System.out.println("for loop: ");
        for (int i=1;i<=10;i++)
            System.out.println(i);

        //we use foreach loop in java for only forward direction. it will not possible in reverse direction.
        int[] arr = {1,4,5,6,7,8,9,3};
        for (int value: arr)
            System.out.println(value);

    }
}
