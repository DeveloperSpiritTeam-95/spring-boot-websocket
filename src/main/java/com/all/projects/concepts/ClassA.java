package com.all.projects.concepts;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClassA {
    private int id;
    private String name;
    private char gender;

    public ClassA(){
        super();
    }

    public ClassA(int id, String name, char gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "ClassA{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }

}
