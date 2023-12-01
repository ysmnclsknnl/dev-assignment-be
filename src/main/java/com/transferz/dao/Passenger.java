package com.transferz.dao;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Passenger {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name", length = 1024, nullable = false)
    private String name;

    @Column(name = "flight_code", length = 20, nullable = false)
    private String flightCode;

}
