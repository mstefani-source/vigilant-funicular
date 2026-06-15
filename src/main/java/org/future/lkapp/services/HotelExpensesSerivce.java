package org.future.lkapp.services;
import java.util.List;

import org.future.lkapp.dto.DailyExpensesRequest;
import org.future.lkapp.dto.HotelexpenseDto;

public interface HotelExpensesSerivce {
    public List<HotelexpenseDto> calculate (DailyExpensesRequest request);
}
