package com.car.car.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class DemandAdminDto {

    private int car_id;
    private String name;
    private String email;
    private String phone_number;
    private String message;
}
