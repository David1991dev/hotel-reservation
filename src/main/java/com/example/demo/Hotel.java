package com.example.demo;


import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;


@Entity
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    private String name;
    @ManyToOne
    @JoinColumn(name= "room_id")
    private Room room;

    public Hotel(String name) {
        this.name = name;
    }

    public Hotel(String name, Room room) {
        this.name = name;
        this.room = room;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
}

