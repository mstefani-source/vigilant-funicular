package org.future.lkapp.dto.businessTrips;

import com.fasterxml.jackson.annotation.JsonValue;

public enum BusinessTripType {
    
    RU, FOREIGN, MIXED;

    @JsonValue
    public String getValue() {
        return name().toLowerCase();
    }
}
