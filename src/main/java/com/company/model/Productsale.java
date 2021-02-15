package com.company.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "productsale")
public class Productsale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @Column(name = "saleDate", nullable = false)
    private Date saleDate;

    @Column(name = "quantity", nullable = false)
    private int quantity;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ProductID")
    private Product product;

    @Override
    public String toString() {
        return "Productsale{" +
                "id=" + id +
                ", saleDate=" + saleDate +
                ", quantity=" + quantity +
                '}';
    }
}
