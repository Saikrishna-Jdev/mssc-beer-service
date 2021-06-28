package com.sai.webservice.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BeerDto {
    private UUID id;
    private Integer version;
    private OffsetTime createdDate;
    private OffsetTime lastModifiedDate;
    private String beerName;
    private BeerStyle beerStyle;
    private long upc;
    private BigDecimal price;
    private Integer quantityOnHand;
}
