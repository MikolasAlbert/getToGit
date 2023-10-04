package com.engeto;

import java.time.LocalDate;

public class Booking {

    private int roomNumber;

    private LocalDate startOfVacation;

    private LocalDate endOfVacation;

    private boolean working;

    private boolean recreational;

    //region

    public Booking(int roomNumber, LocalDate startOfVacation, LocalDate endOfVacation, boolean working, boolean recreational) {
        this.roomNumber = roomNumber;
        this.startOfVacation = startOfVacation;
        this.endOfVacation = endOfVacation;
        this.working = working;
        this.recreational = recreational;
    }


    //endofregion

    //region

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public LocalDate getStartOfVacation() {
        return startOfVacation;
    }

    public void setStartOfVacation(LocalDate startOfVacation) {
        this.startOfVacation = startOfVacation;
    }

    public LocalDate getEndOfVacation() {
        return endOfVacation;
    }

    public void setEndOfVacation(LocalDate endOfVacation) {
        this.endOfVacation = endOfVacation;
    }

    public boolean isWorking() {
        return working;
    }

    public void setWorking(boolean working) {
        this.working = working;
    }

    public boolean isRecreational() {
        return recreational;
    }

    public void setRecreational(boolean recreational) {
        this.recreational = recreational;
    }


    //endofregion
}

