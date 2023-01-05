package org.oop_old.Q2;

public class Car extends Vehicle{
    private int numberOfDoors;

    public Car(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Company=" + Vehicle.COMPANY +
                "numberOfDoors=" + numberOfDoors +
                '}';
    }
}
