package org.oop_old.Q2;

public class Truck extends Vehicle{
    private int numberOfAxles;

    public Truck(int numberOfAxles) {
        this.numberOfAxles = numberOfAxles;
    }

    public int getNumberOfAxles() {
        return numberOfAxles;
    }

    public void setNumberOfAxles(int numberOfAxles) {
        this.numberOfAxles = numberOfAxles;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "Company=" + Vehicle.COMPANY +
                "numberOfAxles=" + numberOfAxles +
                '}';
    }
}
