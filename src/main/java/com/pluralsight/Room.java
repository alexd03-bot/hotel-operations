package com.pluralsight;

public class Room {

    private boolean occupied;
    private int numberOfBeds;
    private double price;
    private boolean dirty;
    private boolean available;


    public Room(boolean occupied, int numberOfBeds, double price, boolean dirty, boolean available){

        this.occupied = occupied;
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.dirty = dirty;
        this.available = available;

    }

    public Room() {

    }


    //occupied
//region
    public boolean isOccupied() {
        return this.occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    //    public boolean isFree() {
//        if (this.occupied == true) {
//            return false;
//        }
//        else {
//            return true;
//        }
//
//    }
//endregion

    //beds
//region
    public Room(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }
//endregion

    //price
//region
    public Room(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
//endregion

//dirty
//region

    public boolean isDirty() {
        return dirty;
    }

    public void setDirty(boolean dirty) {
        this.dirty = dirty;
    }
//endregion

//available
//region

    public boolean isAvailable() {
        return !occupied;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
    //endregion

    public boolean checkIn() {
        setOccupied(true);
        setDirty(true);
        return true;
    }
    public boolean checkOut() {
        setOccupied(false);
        setDirty(true);
        return true;
    }
    public boolean cleanRoom() {
        setOccupied(false);
        setDirty(false);
        return true;
    }






}//class end
