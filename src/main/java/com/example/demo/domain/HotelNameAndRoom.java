package com.example.demo.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.stream.Stream;

@Getter
@Setter
public class HotelNameAndRoom  {

    private Hotel hotel;


    public List<HotelNameAndRoom> getHotels(){
        return (List<HotelNameAndRoom>) Stream.of(hotel.getName(),hotel.getRoomList());
    }

}

