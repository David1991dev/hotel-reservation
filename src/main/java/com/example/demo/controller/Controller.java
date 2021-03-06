package com.example.demo.controller;

import com.example.demo.domain.Room;
import com.example.demo.domain.RoomRepository;
import com.example.demo.usecases.Service;
import com.example.demo.usecases.gethotels.GetHotelsResponse;
import com.example.demo.usecases.gethotels.GetHotelsUseCase;
import com.example.demo.usecases.setreservation.SetReservationRepository;
import com.example.demo.usecases.setreservation.SetReservationUseCase;
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
    @Autowired
    private GetHotelsUseCase getHotelsUseCase;
    @Autowired
    private SetReservationUseCase setReservationUseCase;
    @Autowired
    private SetReservationRepository setReservationRepository;




    @RequestMapping(value = "/hotels", method = RequestMethod.GET)
    public GetHotelsResponse getHotels(){
        return getHotelsUseCase.execute();
    }

    @RequestMapping(value = "/hotel", method = RequestMethod.GET)
    public List<Room> fetchHotelFilter(
            @RequestParam Map<Integer,String> requestParams) {
                Integer price = Integer.valueOf(requestParams.get("price"));
                String roomType = (requestParams.get("roomtype"));
        return hotelService.fetchHotelFilter(price,roomType);
    }

    @RequestMapping(value = "/reserve", method = RequestMethod.PUT)
    public void setReservation(){
        @RequestParam SetReservationRepository requestParams{
            Long roomId =
        }
        //https://spring.io/guides/tutorials/rest/



        }
        setReservationUseCase.execute(roomId,personId,checkIn,checkOut);

    
}
