package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@org.springframework.stereotype.Service
public class Service {


    RoomRepository roomRepository;
    HotelRepository hotelRepository;



    @Autowired
    public void setHotelRepository(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @Autowired
    public void setRoomRepository(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }


    public List<Hotel> fetchExampleHotels() {
        List<Hotel> listOfHotels = new ArrayList<>();
        hotelRepository.findAll().forEach(hotel -> {System.out.println(hotel);listOfHotels.add(hotel);});
        return listOfHotels;
    }

    public List<Room> fetchHotelFilter(Integer price, String roomType) {
        return roomRepository
                .findAll()
                .stream()
                .filter(room -> room.getRoomType().equals(roomType) && room.getPrice()>price).collect(Collectors.toList());
    }


    }




