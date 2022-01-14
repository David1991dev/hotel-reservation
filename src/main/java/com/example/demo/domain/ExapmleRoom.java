package com.example.demo.domain;

import java.util.Arrays;
import java.util.List;

public class ExapmleRoom {

    private static final List<Room> MARRIOTT = Arrays.asList(
        new Room("SingleRoom",1500),
        new Room("SingleRoom",1800),
        new Room("Doubleroom",500),
        new Room("Deluxeroom",2500)
    );

    private static final List<Room> RAMADA = Arrays.asList(
        new Room("SingleRoom",3500),
        new Room("SingleRoom",3800),
        new Room("Doubleroom",3500),
        new Room("Deluxeroom",8500)
    );

    private static final List<Room> HILTON = Arrays.asList(
        new Room("SingleRoom",2500),
        new Room("SingleRoom",2800),
        new Room("Doubleroom",3500),
        new Room("Deluxeroom",4500)
    );

    public static List<Room> getMerriottRooms() {
        return MARRIOTT;
    }
    public static List<Room> getHiltonRooms() {return HILTON;}
    public static List<Room> getRamadaRooms() {return RAMADA;}
}
