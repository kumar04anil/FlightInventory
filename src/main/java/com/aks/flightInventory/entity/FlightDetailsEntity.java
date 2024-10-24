package com.aks.flightInventory.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.OffsetDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "FLIGHT_DETAILS")
public class FlightDetailsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private long flightNumber;
    private int totalSeats;
    private int availableSeats;
    private String source;
    private String destination;
    private OffsetDateTime departureTime;
    private OffsetDateTime arrivalTime;
    private OffsetDateTime departureDate;
    private OffsetDateTime arrivalDate;
    private String airline;
    private String seatClass;
    private Double pricePerSeat;
}
