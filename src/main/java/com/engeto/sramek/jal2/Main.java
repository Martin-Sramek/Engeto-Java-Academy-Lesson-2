package com.engeto.sramek.jal2;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Main {

    public static void main(String[] args) {
    
        Guest guest1 = new Guest("Adéla", "Malíková", LocalDate.of(1993, 3, 13));
        Guest guest2 = new Guest("Jan", "Dvořáček", LocalDate.of(1995, 5, 5));

        Room room1 = new Room(1, 1, true, true, BigDecimal.valueOf(1000));
        Room room2 = new Room(2, 1, true, true, BigDecimal.valueOf(1000));
        Room room3 = new Room(3, 3, false, true, BigDecimal.valueOf(2400));

        ListOfBookings allBookings = new ListOfBookings();
        Booking booking1 = new Booking(room1, LocalDate.of(2021, 7, 19),LocalDate.of(2021, 7, 26), List.of(guest1), TypeOfVacation.BUSSINESS);
        Booking booking2 = new Booking(room3, LocalDate.of(2021, 9, 1),LocalDate.of(2021, 9, 14), List.of(guest1, guest2), TypeOfVacation.RECREATION);
        allBookings.addBooking(booking1);
        allBookings.addBooking(booking2);
        
        System.out.println("Guests:");
        System.out.println(guest1);
        System.out.println(guest2);
        System.out.println();
        System.out.println("Rooms:");
        System.out.println(room1);
        System.out.println(room2);
        System.out.println(room3);
        System.out.println();
        System.out.println("Reservations:");
        allBookings.printAllBookings();
      }
}
