package com.assignment.onlineShop.repository.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.URL;

@Entity
@Getter
@Setter
@Table(name = "BOTTLE")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Bottle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
