package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;


@RestController
public class Controller {

    @Autowired
    private Service hotelService;
    @Autowired
    private RoomRepository roomRepo;



    @RequestMapping(value = "/examplehotel", method = RequestMethod.GET)
    public List<Hotel> fetchHotelExample(){
        return hotelService.fetchExampleHotels();
    }

    @RequestMapping(value = "/hotel", method = RequestMethod.GET)
    public List<Room> fetchHotelFilter(
            @RequestParam Map<Integer,String> requestParams) {
                Integer price = Integer.valueOf(requestParams.get("price"));
                String roomType = (requestParams.get("roomtype"));
        return hotelService.fetchHotelFilter(price,roomType);
    }
    
    
}
