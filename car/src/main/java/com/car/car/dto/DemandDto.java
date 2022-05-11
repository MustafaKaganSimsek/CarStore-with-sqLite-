package com.car.car.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class DemandDto {


    private int id;
    private int car_id;
    private String name;
    private String email;
    private String phone_number;
    private String message;
}
