package org.md.domain;

public class House {

    private int size;
    private int price;
    private int rooms;
    private int livingRooms;

    public House(int size, int price, int rooms, int livingRooms) {
        this.size = size;
        this.price = price;
        this.rooms = rooms;
        this.livingRooms = livingRooms;
    }

    public int getSize() {
        return size;
    }

    public int getPrice() {
        return price;
    }

    public int getRooms() {
        return rooms;
    }

    public int getLivingRooms() {
        return livingRooms;
    }
}
