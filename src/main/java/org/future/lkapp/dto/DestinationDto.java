package org.future.lkapp.dto;

import java.time.LocalDate;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DestinationDto {

    private String countryCode;
    private String type;
    private String destinationName;
    private UUID garUuid;
    private LocalDate arrivalDate;
}
