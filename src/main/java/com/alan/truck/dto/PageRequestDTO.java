package com.alan.truck.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageRequestDTO {

    private int page = 0;

    private int size = 10;

    private String sort;

    /**
     * sort: ASC or DESC
     */
    private String direction = "ASC";
}
