package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class Controller {

    @Autowired
    private Service hotelService;



    @RequestMapping(value = "/examplehotel", method = RequestMethod.GET)
    public Hotel fetchHotelExample(){
        return hotelService.fetchExampleHotel();
    }

    @RequestMapping(value = "/examplehotel/1500", method = RequestMethod.GET)
    public Hotel fetchHotelExample(@RequestParam(value = "price" , defaultValue = "1500")Integer price){
        return hotelService.fetchHotelFilter(price);
    }





    @RequestMapping("/hello")
    public String index(){
        return "Hello";
    }
    

    
    
}
