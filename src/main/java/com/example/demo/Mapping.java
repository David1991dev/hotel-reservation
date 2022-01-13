package com.example.demo;

public class Mapping {

    private Hotel hotel;
    private Room room;
    private Person person;

    public Mapping(Hotel hotel, Room room, Person person) {

        this.hotel = hotel;
        this.room = room;
        this.person = person;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
