package org.oop_old.Q2;

public class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }

    public boolean isHasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "Company=" + Vehicle.COMPANY +
                "hasSidecar=" + hasSidecar +
                '}';
    }
}
