package com.example.demo.domain;

import java.util.Arrays;
import java.util.List;

public class ExampleHotel {

    private static final List<Hotel> HOTELS = Arrays.asList(
            new Hotel("Marriott"),
            new Hotel("Hilton"),
            new Hotel("Danubius"),
            new Hotel("Ramada Hotel")
    );

    public static List<Hotel> getHotels() {
        return HOTELS;
    }

}
