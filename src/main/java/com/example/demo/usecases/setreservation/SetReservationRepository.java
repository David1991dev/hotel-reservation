package com.example.demo.usecases.setreservation;

import com.example.demo.domain.Person;
import com.example.demo.domain.Room;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Component
public class SetReservationRepository {


    private Room room;
    private Person person;
    private LocalDate checkIn;
    private LocalDate checkOut;

}
