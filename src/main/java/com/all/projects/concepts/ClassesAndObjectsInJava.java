package com.all.projects.concepts;

public class ClassesAndObjectsInJava {
    public static void main(String[] args) {

        // Here the objects for a class. which is accessing related
        // variables and methods belonging to particular class
        ClassA classA = new ClassA(1,"prabhakar",'M');
        ClassB classB = new ClassB(23,"10th","mpup");

        // we can access the directly from constructor values or
        // set methods are there which is using lombok or manual written methods
        classA.setId(25);
        classB.setClassId(45);

        // just printing here
        System.out.println(classA);
        System.out.println(classB);

    }
}
