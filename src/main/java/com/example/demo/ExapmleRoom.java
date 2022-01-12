package com.example.demo;

import java.util.Arrays;
import java.util.List;

public class ExapmleRoom {

    private static final List<Room> ROOMS = Arrays.asList(
        new Room("SingleRoom",1500),
        new Room("SingleRoom",1800),
        new Room("Doubleroom",500),
        new Room("Doubleroom",2500)
    );

    public static List<Room> getRooms() {
        return ROOMS;
    }
}
