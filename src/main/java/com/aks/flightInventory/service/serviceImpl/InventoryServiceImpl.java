package com.aks.flightInventory.service.serviceImpl;

import com.aks.flightInventory.entity.FlightDetailsEntity;
import com.aks.flightInventory.mapper.FlightDetailsMapper;
import com.aks.flightInventory.repository.InventoryRepository;
import com.aks.flightInventory.service.InventoryService;
import com.aks.flightInventory.utility.FlightResponseBuilder;
import com.aks.model.FlightFullResponseDataDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InventoryServiceImpl implements InventoryService {

    @Autowired
    private InventoryRepository inventoryRepository;
    @Autowired
    FlightDetailsMapper mapper;

    @Override
    public Optional<FlightFullResponseDataDto> flightBySourceAndDestination(String source, String destination) {
        return Optional.empty();
    }

    /*@Override
    public Optional<FlightResponseBuilder> flightBySourceAndDestination(
            String source,
            String destination) {

        // Initialize the DTO object properly
        FlightResponseBuilder flightBuilder = new FlightResponseBuilder();

        if(source.equals(destination)){
            //return Optional.of();
        }
        // Retrieve the list of flights from the repository
        List<FlightDetailsEntity> response =
                inventoryRepository.findBySourceAndDestination(source, destination);

        if (!response.isEmpty()) {
            flightBuilder.getFullResponseDataDto().setFlights(mapper.entityToDto(response));
            return Optional.of(flightBuilder);
        } else {
            return Optional.empty();
        }
    }*/
}
