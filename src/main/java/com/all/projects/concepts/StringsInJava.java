package com.all.projects.concepts;

public class StringsInJava {
    public static void main(String[] args) {

        // String can store group of characters
        String name = "prabhakar naik";

        // String have multiple java community pre-defined methods which is had in String class
        int length = name.length();
        String[] str = name.split(" ");

        // we can perform any require operation on Strings
        System.out.println("forEach loop");
        for (String value: str)
            System.out.println(value);

        // flow statements
        if(!name.isEmpty())
            System.out.println(name);

        if (length>10)
            System.out.println(name+" length "+length);

        // loops .etc
        for (int i=0;i<name.length();i++)
            System.out.println(name.charAt(i));

        System.out.println("Reverse ");
        for (int i=length-1;i>=0;i--)
            System.out.println(name.charAt(i));


    }
}
