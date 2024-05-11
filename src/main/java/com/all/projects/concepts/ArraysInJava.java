package com.all.projects.concepts;

public class ArraysInJava {
    public static void main(String[] args) {

        // we can store multiple data at a time with respective of common data like homogeneous
        // more understandable way to describe without decimal or accurate 1,2,3,4,5,6 .etc
        int[] arr = {1,2,3,4,5,6,7};

        System.out.println("Normal");
        for (int i=0;i<arr.length;i++)
            System.out.println(arr[i]);

        System.out.println("Reverse");
        for (int i = arr.length-1;i>=0;i--)
            System.out.println(arr[i]);

        // characters store single letter like a,g,f,s,t,e,D,W,Q,G,$,%,#,@ ..etc
        char[] arr1 = {'b','j','u','j','u','l'};
        System.out.println("Normal");
        for (char c : arr1) System.out.println(c);

        System.out.println("Reverse");
        for (int i = arr1.length-1;i>=0;i--)
            System.out.println(arr1[i]);

        // string can store a couple of characters at a time
        // String array can store like string values multiple at a time
        String[] str = {"prabha","sudha","sai","harsh","suresh"};
        System.out.println("----> Normal");
        for (int i=0;i<str.length;i++)
            System.out.println(str[i]);

        System.out.println("----> Reverse");
        for (int i = str.length-1;i>=0;i--)
            System.out.println(str[i]);

        // booleans can store only two values or conditional but result must in boolean
        boolean[] bool = {true,false,3>6,true,false};
        System.out.println("----> Normal");
        for (boolean b : bool) System.out.println(b);

        System.out.println("----> Reverse");
        for (int i = bool.length-1;i>=0;i--)
            System.out.println(bool[i]);


        // byte, shorts and longs like above int data type there is no differ in arrays concept.
        // the storing capable are differ rather than all are similar to perform,
        // so we don't waste on similar functions which is similar possible on array concept
        byte[] bytes = {34,2,3,45,16,38,29,60};
        short[] shorts = {577,33,56,6785,1,3,6,5,3,3};
        long[] longs = {29484,88584,8448,3498,4833,2385};

        // the functions of decimal array can change
        double[] doubles = {23.5,45,67.8,14.8,47,23};
        float[] floats = {56.3f,57.8f,45,86,29,12.6f};
        System.out.println("----> Normal");
        for (double d : doubles) System.out.println(d);

        System.out.println("----> Reverse");
        for (int i = floats.length-1;i>=0;i--)
            System.out.println(floats[i]);

    }
}
