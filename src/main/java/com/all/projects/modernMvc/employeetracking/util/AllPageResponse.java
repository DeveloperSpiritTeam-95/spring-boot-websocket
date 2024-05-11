package com.all.projects.modernMvc.employeetracking.util;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AllPageResponse {
    private Long totalRecords = 0L;
    private List<?> pageResponse = null;

}
