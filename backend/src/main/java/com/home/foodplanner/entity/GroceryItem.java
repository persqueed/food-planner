package com.home.foodplanner.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * A Supplier.
 */
@Entity
@Table(name = "grocery_item")
@Getter
@Setter
@NoArgsConstructor
public class GroceryItem implements Serializable {

    @Id
    @SequenceGenerator(name = "supplierSequenceGenerator", allocationSize = 1)
    @Column(name = "id")
    private Long id;

    @Column(name = "ingredient_name", nullable = false, unique = true)
    private String ingredientName;

    @Column(name = "completed")
    private Boolean completed;

    @Column(name = "quantity")
    private Long quantity;

    @Column(name = "quantity_measurement")
    private String quantityMeasurement;

}
