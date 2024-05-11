package com.all.projects.modernMvc.employeetracking.util;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class PageRequestDto{
    private int page;
    private int size;
    private List<String> sortColumns;
    private String search;
}
