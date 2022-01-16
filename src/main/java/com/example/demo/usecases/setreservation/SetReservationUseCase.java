package com.example.demo.usecases.setreservation;

import com.example.demo.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Optional;

@Component
public class SetReservationUseCase {

    @Autowired
    SetReservationRepository setReservationRepository;
    @Autowired
    RoomRepository roomRepository;
    @Autowired
    PersonRepository personRepository;
    @Autowired
    ReservationRepository reservationRepository




    public void execute(long roomId, Long personId, String checkIn, String checkOut){
        Room room = roomRepository.findById(roomId).orElse(new Room());
        Person person = personRepository.findById(personId).orElse(new Person());
        Reservation newReservation = new Reservation();
        newReservation.setRoom(room);
        newReservation.setPerson(person);
        newReservation.setArrival( LocalDate.parse(checkIn));
        newReservation.setArrival( LocalDate.parse(checkOut));
        reservationRepository.save( newReservation);
    }

}
