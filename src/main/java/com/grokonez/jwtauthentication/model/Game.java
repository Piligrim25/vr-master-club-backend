package com.grokonez.jwtauthentication.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Collection;

@Entity
public class Game {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;

    @NotBlank
    @Size(min=2, max = 100)
    private String name;

    @ManyToMany(mappedBy = "games")
    private Collection<Type> types;

    @NotBlank
    private String ageLimit;

    @NotBlank
    private String imageUrl;

    @OneToOne
    private Discount discount;

    @ManyToMany(mappedBy = "games")
    private Collection<Order> orders;

    public Game() {
    }

    public Game(String name, Collection<Type> types, String ageLimit, String imageUrl, Discount discount, Collection<Order> orders) {
        this.name = name;
        this.types = types;
        this.ageLimit = ageLimit;
        this.imageUrl = imageUrl;
        this.discount = discount;
        this.orders = orders;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Collection<Type> getTypes() {
        return types;
    }

    public void setTypes(Collection<Type> types) {
        this.types = types;
    }

    public String getAgeLimit() {
        return ageLimit;
    }

    public void setAgeLimit(String ageLimit) {
        this.ageLimit = ageLimit;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public Collection<Order> getOrders() {
        return orders;
    }

    public void setOrders(Collection<Order> orders) {
        this.orders = orders;
    }
}
