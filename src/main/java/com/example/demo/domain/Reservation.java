package com.example.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private Room room;
    @OneToOne
    private Person person;
    private LocalDate arrival;
    private LocalDate departure;

    public Reservation(Room room, LocalDate arrival, LocalDate departure) {
        this.room = room;
        this.arrival = arrival;
        this.departure = departure;
    }
}
