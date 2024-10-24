package com.aks.flightInventory.controller;

import com.aks.api.FlightApi;
import com.aks.flightInventory.service.InventoryService;
import com.aks.model.FlightFullResponseDataDto;
import com.aks.model.FlightRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class InventoryController implements FlightApi {

    @Autowired
    InventoryService inventoryService;

   @Override
    public ResponseEntity<FlightFullResponseDataDto> flightsBySourceAndDestination(
            String source,
            String destination) {
        Optional<FlightFullResponseDataDto> availableFlights =
                inventoryService.flightBySourceAndDestination(source, destination);

        return availableFlights
                .map(flights -> ResponseEntity.ok(flights))  // Return 200 OK with flight data if available
                .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).build());  // Return 404 Not Found if no flights
    }

    @Override
    public ResponseEntity<FlightFullResponseDataDto> addNewFlights(FlightRequestDto flightRequestDto) {
       Optional<FlightFullResponseDataDto> response = inventoryService.addNewFlights(flightRequestDto);
       return response.map(flights -> ResponseEntity.ok(flights))
               .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build());
    }
}
