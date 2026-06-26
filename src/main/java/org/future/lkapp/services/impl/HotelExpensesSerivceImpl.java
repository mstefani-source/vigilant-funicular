package org.future.lkapp.services.impl;

import java.time.format.DateTimeFormatter;
import java.util.List;

import org.future.lkapp.dto.DailyExpensesRequest;
import org.future.lkapp.dto.DestinationDto;
import org.future.lkapp.dto.HotelexpenseDto;
import org.future.lkapp.dto.businessTrips.BusinessTrips;
import org.future.lkapp.facades.SecurityFacade;
import org.future.lkapp.facades.StaffPlacemantFasade;
import org.future.lkapp.services.HotelExpensesSerivce;
import org.future.lkapp.services.NormsService;
import org.future.lkapp.services.OmMgmService;
import org.springframework.stereotype.Service;

@Service
public class HotelExpensesSerivceImpl implements HotelExpensesSerivce {
    
    private final NormsService normService;
    private final StaffPlacemantFasade staffPlacemantFasade;
    private final OmMgmService omMgmService;
    private final SecurityFacade securityFacade;

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


    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyy-MM-dd");

    @Override
    public List<HotelexpenseDto> calculate(DailyExpensesRequest request) {

        List<String> companyIds = securityFacade.extractCompanyIds();

        BusinessTrips businessTrip = BusinessTripsFactory.getTrip(request);


        String gh = new String();

        for (int i = 0; i < 100000; i++) {
            int category = staffPlacemantFasade.getCategory();
            int mgm = omMgmService.getNorm();
            int bablo = normService.getamount(businessTrip.getCity());
            int bablo2 = normService.getamount(businessTrip.getCountry());
        }

        List<DestinationDto> destinations = businessTrip.getDestinations();
        HotelexpenseDto hotel1 = new HotelexpenseDto();
        HotelexpenseDto hotel2 = new HotelexpenseDto();
        HotelexpenseDto hotel3 = new HotelexpenseDto();

        return List.of(hotel1, hotel2, hotel3);
    }

}
