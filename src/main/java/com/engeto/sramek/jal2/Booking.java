package com.engeto.sramek.jal2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Booking {

    private List<Guest> guests;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private Room room;
    private TypeOfVacation typeOfVacation;
    
    public Booking(Room room, LocalDate checkIn, LocalDate checkOut, List<Guest> guests, TypeOfVacation typeOfVacation) {
        this.room = room;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.guests = guests;
        this.typeOfVacation = typeOfVacation;
    }

    public List<Guest> getGuests() {
        return this.guests;
    }

    public void setGuests(List<Guest> guests) {
        this.guests = guests;
    }

    public LocalDate getCheckIn() {
        return this.checkIn;
    }

    public void setCheckIn(LocalDate checkIn) {
        this.checkIn = checkIn;
    }

    public LocalDate getCheckOut() {
        return this.checkOut;
    }

    public void setCheckOut(LocalDate checkOut) {
        this.checkOut = checkOut;
    }

    public Room getRoom() {
        return this.room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    @Override
    public String toString() {
        String purpose = typeOfVacation.toString().toLowerCase();
        String guestsName = "";
        for (Guest guest : guests) {
            guestsName += guest + ", ";     
        }

        return "Room No." + room.getId() +
            " is reserved for: " + guestsName.substring(0, guestsName.length() - 2) +
            ".\nThis reservation is valid from " + getCheckIn().format(DateTimeFormatter.ofPattern("d.M.yyyy")) +
            " to " + getCheckOut().format(DateTimeFormatter.ofPattern("d.M.yyyy")) + "." + 
            "\nType of vacation: " + purpose + "." ;
    }

}
