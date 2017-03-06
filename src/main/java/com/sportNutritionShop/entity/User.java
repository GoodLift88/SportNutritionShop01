package com.sportNutritionShop.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "user")
public class User implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")


    public long getUser_id() {
        return user_id;
    }


    @Column(name = "user_name")
    public String getName() {
        return name;
    }

    @Column(name = "user_second_name")
    public String getS_name() {
        return s_name;
    }

    @Column(name = "user_email")
    public String getEmail() {
        return email;
    }

    @Column(name = "user_cell_number")
    public String getNumber() {
        return number;
    }

    public void setUser_id(long user_id) {

        this.user_id = user_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    private long user_id;
    private String name;

    private String s_name;
    private String email;
    private String number;

    public User(long user_id, String name, String s_name, String email, String number) {
        this.user_id = user_id;
        this.name = name;
        this.s_name = s_name;
        this.email = email;
        this.number = number;

    }

    public User() {


    }
    private Set<Order> orderSet = new HashSet<>();
    @OneToMany (fetch = FetchType.LAZY, cascade = CascadeType.ALL,mappedBy = "user")



    public Set<Order> getOrderSet() {
        return orderSet;
    }

    public void setOrderSet(Set<Order> orderSet) {
        this.orderSet = orderSet;
    }
}
