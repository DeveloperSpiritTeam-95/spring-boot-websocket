package com.all.projects.modernMvc.employeetracking.enums;

public enum Status {
    ACTIVE("ACTIVE"),
    ABSCOND("ABSCOND"),
    RELIEVED("RELIEVED"),
    TERMINATE("TERMINATE");

    public final String status;
    Status(String status) {
        this.status = status;
    }

}

