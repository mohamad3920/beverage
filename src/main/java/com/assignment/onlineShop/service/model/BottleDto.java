package com.assignment.onlineShop.service.model;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.URL;

@Getter
@Setter
@Builder
public class BottleDto {
    private Long id;
    @NotNull
    @NotEmpty
    private String name;
    @URL
    private String bottlePic;
    @Positive
    private Double volume;
    private Boolean isAlcoholic;
    private Double volumePercent;
    @Positive
    private Double price;
    @NotNull
    @NotEmpty
    private String supplier;
    @Positive
    private Integer inStock;
}
