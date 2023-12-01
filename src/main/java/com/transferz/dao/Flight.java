package com.transferz.dao;

import javax.persistence.Column;
import javax.persistence.Id;
import java.time.LocalDateTime;

public class Flight {
    @Id
    @Column(name = "code", length = 20)
    private String code;

    @Column(name = "origin_airport_id", length = 20)
    private String originAirportId;

    @Column(name = "destination_airport_id", length = 20)
    private String destinationAirportId;

    @Column(name = "departure_time")
    private LocalDateTime departureTime;

    @Column(name = "arrival_time")
    private LocalDateTime arrivalTime;

}
