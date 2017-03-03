package com.sportNutritionShop.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "product")
public class Product implements Serializable {
    private long id;
    private String type;
    private String brand;
    private String category;
    private double price;
    private double weight;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    public long getId() {
        return id;
    }

    @Column(name = "product_type")
    public String getType() {
        return type;
    }

    @Column(name = "product_name")
    public String getBrand() {
        return brand;
    }

    @Column(name = "product_category")
    public String getCategory() {
        return category;
    }

    @Column(name = "product_price")
    public double getPrice() {
        return price;
    }

    @Column(name = "product_weight")
    public double getWeight() {
        return weight;
    }

    public void setId(long id) {

        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Product(long id, String type, String brand, String category, double price, double weight) {

        this.id = id;
        this.type = type;
        this.brand = brand;
        this.category = category;
        this.price = price;
        this.weight = weight;
    }

    public Product() {

    }
}
