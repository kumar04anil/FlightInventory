package com.aks.flightInventory.service;

import com.aks.model.FlightFullResponseDataDto;

import java.util.Optional;

public interface InventoryService {
    Optional<FlightFullResponseDataDto> flightBySourceAndDestination(String source, String destination);
}
