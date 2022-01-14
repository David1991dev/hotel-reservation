package com.example.demo.usecases;

import com.example.demo.domain.Hotel;
import com.example.demo.domain.HotelRepository;
import com.example.demo.domain.Room;
import com.example.demo.domain.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;

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


    public List<Hotel> fetchHotels() {
        return hotelRepository
                .findAll();
    }


    public List<Room> fetchHotelFilter(Integer price, String roomType) {
        return roomRepository
                .findAll()
                .stream()
                .filter(room -> room.getRoomType().equals(roomType) && room.getPrice()>price).collect(Collectors.toList());
    }


    }




