package com.transferz.controller;

import com.transferz.dao.Airport;
import com.transferz.service.AirportService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/api/airports")
public class AirportController {
    //Returns airports
    private AirportService airportService;

    public AirportController(AirportService airportService) {
        this.airportService = airportService;
    }

    @GetMapping
    public ResponseEntity<List<Airport>> listAirports() {
        return ResponseEntity.ok(airportService.getAirports());
    }

    @PostMapping
    public ResponseEntity<Airport> addAirport(@RequestBody Airport airport) throws Exception {

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(airportService.addAirport(airport));
    }


}
