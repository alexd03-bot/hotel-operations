package com.pluralsight;

public class Reservation {

    private static String roomType;
    private static boolean weekend;
    private static int numberOfNights;

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getRoomPrice() {
        double price = 0;

        switch(this.roomType) {
            case "king" -> {price = 139.00;}
            case "double" -> {price = 124.00;}
            default -> {
                System.out.println("Error");
            }

        }
        return price;
    }



    public static boolean isWeekend() {
        return weekend;
    }

    public void setWeekend(boolean weekend) {
        this.weekend = weekend;
    }

    public static int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public double getReservationTotal() {
        double reservationTotal = this.getRoomPrice();
        if (isWeekend()) {
            reservationTotal = this.getRoomPrice() + (this.getRoomPrice() * 0.1);
        }

        return reservationTotal;
    }


}
