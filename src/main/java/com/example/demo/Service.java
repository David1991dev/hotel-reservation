package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;


@org.springframework.stereotype.Service
public class Service {

    Person david = new Person("David");
    Person laura = new Person("David");


    public static RoomRepository roomRepo;
    static HotelRepository hotelRepo;

    @Autowired
    public void setRoomRepository(RoomRepository roomRepo) {
        this.roomRepo = roomRepo;
    }


    @Autowired
    public void setHotelRepository(HotelRepository hotelRepo) {
        this.hotelRepo = hotelRepo;
    }


    public Hotel fetchExampleHotel() {
        List<LocalDate> dates = Dates.dateRange("2021-01-01" , "2021-01-05");
        List<Hotel> listOfHotels = new ArrayList<Hotel>();
        Hotel marriott = new Hotel("Marriott");
        List<Room> rooms = ExapmleRoom.getRooms();

        rooms.sort((r1,r2) -> r1.getPrice().compareTo(r2.getPrice()));

        for(Room room : rooms){
        System.out.println(room);
        }
        return marriott;
    }

    public List<Room> fetchHotelFilter(Integer price, String roomType) {
        List<Room> rooms = new ArrayList<>();
           ExapmleRoom.getRooms()
                 .stream()
                 .filter(room -> room.getPrice() > price && room.getRoomType().equals(roomType))
                 .forEach(room -> {rooms.add(room); System.out.println(room);});
           return rooms;

    }


    public static void init() {
            ExapmleRoom.getRooms()
                    .stream()
                    .forEach(room -> roomRepo.save(room));
            ExampleHotel.getHotels()
                    .stream().
                    forEach(hotel -> hotelRepo.save(hotel));
        }
    }




