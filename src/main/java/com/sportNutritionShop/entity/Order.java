package com.sportNutritionShop.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "`order`")
public class Order implements Serializable  {

    private User user;
    private long order_id;
    private Set<Product>products=new HashSet<>();


    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    public long getOrder_id() {
        return order_id;
    }


    public void setOrder_id(long order_id) {

        this.order_id = order_id;
    }




    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="user_id")
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    @ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
    @JoinTable(name = "order_product",
            joinColumns={@JoinColumn(name = "order_id")},
            inverseJoinColumns={@JoinColumn(name = "id")})
    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }
}
