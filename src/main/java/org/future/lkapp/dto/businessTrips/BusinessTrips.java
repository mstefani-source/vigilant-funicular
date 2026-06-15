package org.future.lkapp.dto.businessTrips;

import java.time.LocalDate;
import java.util.List;

import org.future.lkapp.dto.DestinationDto;


public abstract class BusinessTrips {
    LocalDate dateFrom;
    LocalDate dateTo;
    String tripNumber;
    List<DestinationDto> destinations;
    String companyGroup;
    BusinessTripType businessTripType;
    
}