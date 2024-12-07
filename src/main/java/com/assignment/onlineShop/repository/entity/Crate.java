package com.assignment.onlineShop.repository.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "CRATE")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Crate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    @OneToMany
    private List<Bottle> bottles;
}
