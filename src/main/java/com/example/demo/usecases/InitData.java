package com.example.demo.usecases;

import com.example.demo.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class InitData {


    RoomRepository roomRepository;
    HotelRepository hotelRepository;
    PersonRepository personRepository;


    @Autowired
    public void setHotelRepository(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @Autowired
    public void setRoomRepository(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    @Autowired
    public void setPersonRepository(PersonRepository personRepository) {this.personRepository = personRepository;}




    @PostConstruct
    private void init(){
        Hotel mariott = new Hotel("Marriott");
        Hotel hilton = new Hotel("Hilton");
        Hotel ramada = new Hotel("Ramada");

        hotelRepository.save(mariott);
        hotelRepository.save(hilton);
        hotelRepository.save(ramada);

        ExapmleRoom.getMerriottRooms()
                .forEach(room -> {
                    room.setHotel(mariott);
                    roomRepository.save(room);
                });

        ExapmleRoom.getHiltonRooms()
                .forEach(room -> {
                    room.setHotel(hilton);
                    roomRepository.save(room);
                });

        ExapmleRoom.getRamadaRooms()
                .forEach(room -> {
                    room.setHotel(ramada);
                    roomRepository.save(room);
                });


        ExamplePerson.getPersons().forEach(person -> personRepository.save(person));



    }



}
