package com.example.demo.usecases.gethotels;

import com.example.demo.domain.HotelRepository;
import com.example.demo.domain.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class GetHotelsUseCase {

    @Autowired
    HotelRepository hotelRepository;


    public GetHotelsResponse execute() {
        Map<String, List<Long>> hotelList = new HashMap<>();
        hotelRepository
            .findAll()
            .forEach(hotel -> {
                hotelList
                    .put(hotel.getName(), hotel.getRoomList()
                    .stream()
                    .map(Room::getId)
                    .collect(Collectors.toList()));
            });

//        return  new GetHotelsResponse(hotelList); is equal to
        return GetHotelsResponse.builder().hotels(hotelList).build();
    }

}
