package com.example.demo.domain;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    private String name;
    @OneToMany(mappedBy = "hotel" ,fetch = FetchType.LAZY)
//    @JsonManagedReference
    private List<Room> roomList;

    public Hotel(String name) {
        this.name = name;
    }

}

