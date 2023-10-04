package com.engeto;

import java.time.LocalDate;

public class Visitor {

    private String name;
    private String surname;
    private LocalDate dateOfBirth;
    private int roomNumber;
    private int numberOfBeds;
    private boolean seaView;
    private int pricePerNight;

    //region

    public Visitor(String name, String surname, LocalDate dateOfBirth, int roomNumber, int numberOfBeds, boolean seaView, int pricePerNight) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.roomNumber = roomNumber;
        this.numberOfBeds = numberOfBeds;
        this.seaView = seaView;
        this.pricePerNight = pricePerNight;
    }


    //endregion

    //region

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public boolean isSeaView() {
        return seaView;
    }

    public void setSeaView(boolean seaView) {
        this.seaView = seaView;
    }

    public int getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(int pricePerNight) {
        this.pricePerNight = pricePerNight;
    }


    //endregion

}
