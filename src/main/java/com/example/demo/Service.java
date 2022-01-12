package com.example.demo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


@org.springframework.stereotype.Service
public class Service {

    Person david = new Person("David");
    Person laura = new Person("David");





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

    public Hotel fetchHotelFilter(Integer price) {
        List<LocalDate> dates = Dates.dateRange("2021-01-01" , "2021-01-05");
        List<Hotel> listOfHotels = new ArrayList<Hotel>();
        Hotel marriott = new Hotel("Marriott");
        List<Room> rooms = ExapmleRoom.getRooms();

        rooms.sort((r1,r2) -> r1.getPrice().compareTo(r2.getPrice()));

        for(Room room : rooms){
            if(room.getPrice() > price) {
                System.out.println(room);
            }
        }
        return marriott;
    }





}
