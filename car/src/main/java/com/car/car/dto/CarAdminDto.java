package com.car.car.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

@Builder

public class CarAdminDto {

    private int id;
    private String name;
    private Double price;
}
