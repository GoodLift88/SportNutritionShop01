package com.sportNutritionShop.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "`order`")
public class Order implements Serializable {
    private long order_id;


    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    public long getOrder_id() {
        return order_id;
    }


    public void setOrder_id(long order_id) {

        this.order_id = order_id;
    }


    public Order(long order_id) {

        this.order_id = order_id;

    }

    public Order() {

    }

    private User user;

    @ManyToOne()
    @JoinColumn(name = "order_id",insertable = false,updatable = false,referencedColumnName = "user_id")



    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
