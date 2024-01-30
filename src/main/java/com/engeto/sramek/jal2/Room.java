package com.engeto.sramek.jal2;

import java.math.BigDecimal;

public class Room {
    private int id;
    private int numberOfBeds;
    private boolean hasBalcony;
    private boolean viewOfSea;
    private BigDecimal pricePerNight;

    public Room(int id, int numberOfBeds, boolean hasBalcony, boolean viewOfSea, BigDecimal pricePerNight) {
        this.id = id;
        this.numberOfBeds = numberOfBeds;
        this.hasBalcony = hasBalcony;
        this.viewOfSea = viewOfSea;
        this.pricePerNight = pricePerNight;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumberOfBeds() {
        return this.numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public boolean getHasBalcony() {
        return this.hasBalcony;
    }

    public void setHasBalcony(boolean hasBalcony) {
        this.hasBalcony = hasBalcony;
    }

    public boolean getViewOfSea() {
        return this.viewOfSea;
    }

    public void setViewOfSea(boolean viewOfSea) {
        this.viewOfSea = viewOfSea;
    }

    public BigDecimal getPricePerNight() {
        return this.pricePerNight;
    }

    public void setPricePerNight(BigDecimal pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    @Override
    public String toString() {
        String balcony = "no";
        String seaside = "no";

        if (hasBalcony) {balcony = "yes";}
        if (viewOfSea) {seaside = "yes";}          
        
        return "Room" + " No." + getId() + ":" +
            " beds:" + getNumberOfBeds() +
            ", balcony:" + balcony +
            ", view of the sea:" + seaside +
            ", price:" + getPricePerNight() + " (CZK/night).";
    }
}
