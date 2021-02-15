package com.company.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "title", nullable = false)
    private String title;
    @Column(name = "cost", nullable = false)
    private double cost;
    @Column(name = "description", nullable = false)
    private String description;
    @Column(name = "MainImagePath", nullable = false)
    private String imagePath;
    @Column(name = "isActive", nullable = false)
    private String isActive;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ManufacturerID")
    private Manufacturer manufacturer;

    @OneToMany(mappedBy = "product", fetch = FetchType.EAGER)
    private Set<Product> products;


    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", cost=" + cost +
                ", description='" + description + '\'' +
                ", imagePath='" + imagePath + '\'' +
                ", isActive='" + isActive + '\'' +
                '}';
    }
}
