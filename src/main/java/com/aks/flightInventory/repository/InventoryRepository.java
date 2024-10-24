package com.aks.flightInventory.repository;

import com.aks.flightInventory.entity.FlightDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InventoryRepository extends JpaRepository<FlightDetailsEntity, Long> {
    List<FlightDetailsEntity> findBySourceAndDestination(String source, String destination);
}
