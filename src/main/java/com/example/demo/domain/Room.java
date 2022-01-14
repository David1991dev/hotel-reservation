package com.example.demo.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String roomType;
    private Integer price;
    private LocalDate availableFrom;
    private LocalDate availableUntil;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name ="hotel_id")
//    @JsonBackReference
    private Hotel hotel;



    public Room(String roomType, Integer price, Hotel hotel) {
        this.roomType = roomType;
        this.price = price;
        this.hotel = hotel;
    }

    public Room(String roomType, Integer price) {
        this.roomType = roomType;
        this.price = price;
        this.availableFrom = LocalDate.parse("2021-01-01");
        this.availableUntil = LocalDate.parse("2021-12-30");
    }

    @Override
    public String toString() {
        return id +" " +roomType +" "+ price + " Ft";
    }
}
