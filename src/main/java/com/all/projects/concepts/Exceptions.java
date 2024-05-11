package com.all.projects.concepts;

public class Exceptions {
    public static void main(String[] args) {

        // we can't use try block individually
        // we can't use catch block individually
        // we can't use finally block individually
        int a = 10;
        try{
            int result = a / 0;
            System.out.printf("ghjnkl");
        }finally {
            try {
               int result = a / 2;
                System.out.println("success");
            }catch (Exception e){
                e.printStackTrace();

            }
        }
    }
}
