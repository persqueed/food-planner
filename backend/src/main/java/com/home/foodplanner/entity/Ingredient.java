package com.home.foodplanner.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

/**
 * A Supplier.
 */
@Entity
@Table(name = "ingredient")
@Getter
@Setter
@NoArgsConstructor
public class Ingredient implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "ingredient_name", nullable = false, unique = true)
    private String ingredientName;

    @Column(name = "quantity")
    private Long quantity;

    @Column(name = "quantity_measurement")
    private String quantityMeasurement;
}
