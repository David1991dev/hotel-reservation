package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class InitData {


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




    @PostConstruct
    private void init(){
        ExapmleRoom.getRooms()
                .forEach(room -> roomRepository.save(room));
        ExampleHotel.getHotels()
                .forEach(hotel -> hotelRepository.save(hotel));

    }



}
