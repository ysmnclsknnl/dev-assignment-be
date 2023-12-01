package com.transferz.repository;

import com.transferz.dao.Airport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirportRepository extends JpaRepository<Airport, String> {
    boolean existsAirportByName(String name);
}
