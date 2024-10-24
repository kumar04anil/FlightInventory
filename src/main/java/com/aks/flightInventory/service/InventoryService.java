package com.aks.flightInventory.service;

import com.aks.model.FlightFullResponseDataDto;
import com.aks.model.FlightRequestDto;

import java.util.Optional;

public interface InventoryService {
    Optional<FlightFullResponseDataDto> flightBySourceAndDestination(String source, String destination);

    Optional<FlightFullResponseDataDto> addNewFlights(FlightRequestDto flightRequestDto);
}
