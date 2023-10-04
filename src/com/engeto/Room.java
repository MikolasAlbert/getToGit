package com.engeto;

public class Room {
    private int roomnumer;
    private boolean isOneBed;
    private boolean hasBalcony;
    private int pricePerNight;

    public Room(int roomnumer, boolean isOneBed, boolean hasBalcony, int pricePerNight) {
        this.roomnumer = roomnumer;
        this.isOneBed = isOneBed;
        this.hasBalcony = hasBalcony;
        this.pricePerNight = pricePerNight;
    }

    public int getRoomnumer() {
        return roomnumer;
    }

    public void setRoomnumer(int roomnumer) {
        this.roomnumer = roomnumer;
    }

    public boolean isOneBed() {
        return isOneBed;
    }

    public void setOneBed(boolean oneBed) {
        isOneBed = oneBed;
    }

    public boolean isHasBalcony() {
        return hasBalcony;
    }

    public void setHasBalcony(boolean hasBalcony) {
        this.hasBalcony = hasBalcony;
    }

    public int getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(int pricePerNight) {
        this.pricePerNight = pricePerNight;
    }
}


