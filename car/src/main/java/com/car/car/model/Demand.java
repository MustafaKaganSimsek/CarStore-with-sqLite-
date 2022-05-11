package com.car.car.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Demand")
@Getter
@Setter
@RequiredArgsConstructor
public class Demand {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "car_id")
    private int car_id;

    @Column(name = "name",length = 128)
    private String name;

    @Column(name = "email",length = 128)
    private String email;

    @Column(name = "phone_number",length = 11)
    private String phone_number;

    @Column(name = "message")
    private String message;
}
