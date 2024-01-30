package com.engeto.sramek.jal2;

import java.util.ArrayList;
import java.util.List;

public class ListOfBookings {
    private List<Booking> bookings;

    public ListOfBookings() {
        bookings = new ArrayList<>();
    }

    public List<Booking> getBookings() {
        return this.bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }

    public void addBooking(Booking booking) {
        bookings.add(booking);
    }

    public Booking getBooking(Booking booking, int index) {
        return bookings.get(index);
    }

    public void printAllBookings() {
        bookings.forEach(System.out::println);
    }
}
