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
@Table(name = "grocery_item")
@Getter
@Setter
@NoArgsConstructor
public class GroceryItem implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "completed")
    private Boolean completed;


    @ManyToOne(optional = false)
    private Ingredient ingredient;

}
