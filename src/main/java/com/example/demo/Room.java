package com.example.demo;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String roomType;
    private Integer price;
    @ManyToOne
    @JoinColumn(name ="hotel_id")
    private Hotel hotel;


    public Room(String roomType, Integer price, Hotel hotel) {
        this.roomType = roomType;
        this.price = price;
        this.hotel = hotel;
    }

    public Room(String roomType, Integer price) {
        this.roomType = roomType;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    @Override
    public String toString() {
        return id +" " +roomType +" "+ price + " Ft";
    }
}
