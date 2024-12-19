package com.assignment.onlineShop.service.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.URL;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BottleDto {
    private Long id;
    @NotBlank(message = "Name is required.")
    private String name;
    @URL
    private String bottlePic;
    @Positive(message = "volume must be a positive number.")
    private Double volume;
    private Boolean isAlcoholic;
    private Double volumePercent;
    @Positive(message = "Price must be a positive number.")
    private Double price;
    @NotBlank(message = "Supplier is required.")
    private String supplier;
    @Positive(message = "inStock must be a positive number.")
    private Integer inStock;
    @Positive(message = "quantity must be a positive number.")
    private Integer quantity;
}
