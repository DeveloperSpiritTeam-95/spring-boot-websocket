package com.all.projects.concepts;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClassB {
    private int classId;
    private String standard;
    private String school;

    public ClassB(){
        super();
    }

    public ClassB(int classId,String standard,String school){
        this.classId = classId;
        this.standard = standard;
        this.school = school;
    }


    @Override
    public String toString() {
        return "ClassB{" +
                "classId=" + classId +
                ", standard='" + standard + '\'' +
                ", school='" + school + '\'' +
                '}';
    }
}
