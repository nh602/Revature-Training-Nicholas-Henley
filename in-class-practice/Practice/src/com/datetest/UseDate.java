package com.datetest;

import java.time.*;
import java.time.format.*;

public class UseDate {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Today's date: " + today);

        LocalTime currentTime = LocalTime.now();
        System.out.println("Current time: " + currentTime);

        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current date and time: " + currentDateTime);

        LocalDate newDate = LocalDate.of(2026, 5, 20);

        System.out.println("year: " + currentDateTime.getYear());
        System.out.println("month: " + currentDateTime.getMonth());
        System.out.println("day: " + currentDateTime.getDayOfMonth());
        System.out.println("day of the week: " + currentDateTime.getDayOfWeek());

        System.out.println("After ten days: " + currentDateTime.plusDays(10));
        System.out.println("Two months ago: " + currentDateTime.minusMonths(2));
        System.out.println("One year in the future: " + currentDateTime.plusYears(1));

        Period per = Period.between(newDate, today);
        System.out.println(per);
        System.out.println(per.getYears());
        System.out.println(per.getMonths());
        System.out.println(per.getDays());

        DateTimeFormatter datifo = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        
        System.out.println(datifo.format(newDate));

        String inputDate = "06-11-2003";
        LocalDate dateFormat = LocalDate.parse(inputDate, datifo);
        System.out.println(dateFormat);

    }
}
