package org.future.lkapp.services.impl;

import java.time.format.DateTimeFormatter;
import java.util.List;

import org.future.lkapp.dto.DailyExpensesRequest;
import org.future.lkapp.dto.DestinationDto;
import org.future.lkapp.dto.HotelexpenseDto;
import org.future.lkapp.dto.businessTrips.BusinessTrip;
import org.future.lkapp.dto.businessTrips.BusinessTripHotels;
import org.future.lkapp.facades.SecurityFacade;
import org.future.lkapp.facades.StaffPlacemantFasade;
import org.future.lkapp.services.HotelExpensesSerivce;
import org.future.lkapp.services.NormsService;
import org.future.lkapp.services.OmMgmService;
import org.springframework.stereotype.Service;

@Service
public class HotelExpensesSerivceImpl implements HotelExpensesSerivce {

    public HotelExpensesSerivceImpl(
            NormsService normService,
            StaffPlacemantFasade staffPlacemantFasade,
            OmMgmService omMgmService,
            SecurityFacade securityFacade) {
        this.normService = normService;
        this.staffPlacemantFasade = staffPlacemantFasade;
        this.omMgmService = omMgmService;
        this.securityFacade = securityFacade;
    }

    private final NormsService normService;
    private final StaffPlacemantFasade staffPlacemantFasade;
    private final OmMgmService omMgmService;
    private final SecurityFacade securityFacade;

    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyy-MM-dd");

    @Override
    public List<HotelexpenseDto> calculate(DailyExpensesRequest request) {

        List<String> companyIds = securityFacade.extractCompanyIds();

        BusinessTrips bt = BusinesstripFactory.getTrip(request);
        
        List<DestinationDto> destinations = businessTrip.getDestinations();
        HotelexpenseDto hotel1 = new HotelexpenseDto();
        HotelexpenseDto hotel2 = new HotelexpenseDto();
        HotelexpenseDto hotel3 = new HotelexpenseDto();

        return List.of(hotel1, hotel2, hotel3);
    }

}
