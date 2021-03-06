package com.restaurant.reservationApp.table;

public class Table {
    private long id;
    private int numberOfChairs;
    private int floor;

    public Table() {
    }

    public Table(long id, int numberOfChairs, int floor) {
        this.id = id;
        this.numberOfChairs = numberOfChairs;
        this.floor = floor;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getNumberOfChairs() {
        return numberOfChairs;
    }

    public void setNumberOfChairs(int numberOfChairs) {
        this.numberOfChairs = numberOfChairs;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "Table{" +
                "id=" + id +
                ", numberOfChairs=" + numberOfChairs +
                ", floor=" + floor +
                '}';
    }
}
