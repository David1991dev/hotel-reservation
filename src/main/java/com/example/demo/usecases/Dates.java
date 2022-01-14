package com.example.demo.usecases;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Dates {

    public String s = "2021.01.01";
    public String e = "2021.01.10";


    public static List<LocalDate> dateRange(String s, String e) {
        LocalDate start = LocalDate.parse(s);
        LocalDate end = LocalDate.parse(e);
        List<LocalDate> availableDates = new ArrayList<>();
        while (start.isBefore(end)) {
            availableDates.add(start);
            start = start.plusDays(1);
            System.out.println(start);
        }
        return availableDates;


    }

}
