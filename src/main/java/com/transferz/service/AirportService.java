package com.transferz.service;

import com.transferz.dao.Airport;
import com.transferz.exception.AirportAlreadyExistsException;
import com.transferz.repository.AirportRepository;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;

@Service
public class AirportService {
    private AirportRepository airportRepository;

    public AirportService(AirportRepository airportRepository) {
        this.airportRepository = airportRepository;
    }

    public List<Airport> getAirports() {
        return airportRepository.findAll();
    }

    public Airport addAirport(@Valid Airport airport) throws Exception {
        // Check if the code or name already exists
        if (airportRepository.existsById(airport.getCode())) {
            throw new AirportAlreadyExistsException("Airport code already exists.");
        }
        if (airportRepository.existsAirportByName(airport.getName())) {
            throw new AirportAlreadyExistsException("Airport name already exists.");
        }
        return airportRepository.save(airport);
    }
}
