package com.grokonez.jwtauthentication.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Collection;

@Entity
public class Order {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;

    @NotBlank
    private String startTime;

    @NotBlank
    private String duration;

    @NotBlank
    @Size(min=1, max = 10)
    private String numberOfPeople;

    @ManyToMany
    private Collection<Game> games;

    @OneToOne
    private User user;

    public Order() {
    }

    public Order(String startTime, String duration, String numberOfPeople, Collection<Game> games, User user) {
        this.startTime = startTime;
        this.duration = duration;
        this.numberOfPeople = numberOfPeople;
        this.games = games;
        this.user = user;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(String numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public Collection<Game> getGames() {
        return games;
    }

    public void setGames(Collection<Game> games) {
        this.games = games;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
