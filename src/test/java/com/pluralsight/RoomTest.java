package com.pluralsight;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    public void checkIn_room_occupied_and_dirty() {
        //arrange
        Room room = new Room();
        room.setOccupied(true);
        room.setDirty(true);
        //act
        room.checkIn();
        //assert
        Assertions.assertTrue(room.checkIn());



    }


    @org.junit.jupiter.api.Test
    void checkOut() {
        //arrange
        Room room = new Room();
        room.setOccupied(false);
        room.setDirty(true);

        //act
        room.checkOut();

        //assert
        Assertions.assertTrue(room.checkOut());

    }

    @org.junit.jupiter.api.Test
    void cleanRoom() {
        //arrange
        Room room = new Room();
        room.setOccupied(false);
        room.setDirty(true);

        //act

        //assert
        Assertions.assertTrue(room.cleanRoom());



    }
}