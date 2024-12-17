package com.assignment.onlineShop.service.model;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.URL;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CrateDto {
    private Long id;
    @NotNull
    @NotEmpty
    private String name;
    @URL
    private String cratePic;
    @Positive
    private Integer noOfBottles;
    @Positive
    private Double price;
    @Positive
    private Integer cratesInStock;
    private List<BottleDto> bottles;
}
