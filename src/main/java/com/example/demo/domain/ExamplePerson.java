package com.example.demo.domain;


import java.util.Arrays;
import java.util.List;

public class ExamplePerson {

    private static final List<Person> PERSONS = Arrays.asList(
            new Person("David"),
            new Person("Laura"),
            new Person("Adrienn")
    );

    public static List<Person> getPersons (){return PERSONS;
    }

}
