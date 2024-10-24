package com.aks.flightInventory.mapper;

import com.aks.flightInventory.entity.FlightDetailsEntity;
import com.aks.model.FlightDetailsDataDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface FlightDetailsMapper {
    FlightDetailsMapper INSTANCE = Mappers.getMapper(FlightDetailsMapper.class);

    // Mapping from DTO to Entity
    List<FlightDetailsDataDto> entityToDto(List<FlightDetailsEntity> entity);
}
