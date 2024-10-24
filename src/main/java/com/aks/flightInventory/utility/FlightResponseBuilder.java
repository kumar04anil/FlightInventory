package com.aks.flightInventory.utility;

import com.aks.model.FlightFullResponseDataDto;
import lombok.Data;

@Data
public class FlightResponseBuilder {
    private String status;
    private String code;
    private FlightFullResponseDataDto fullResponseDataDto;
}
