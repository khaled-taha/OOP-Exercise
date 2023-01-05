
package final2021.Q4;

public class CruiseShip extends Ship{
    
    private int maxNumberOfPassengers;

    public CruiseShip(int maxNumber, String name, String year) {
        super(name, year);
        this.maxNumberOfPassengers = maxNumber;
    }

    public int getMaxNumber() {
        return maxNumberOfPassengers;
    }

    public void setMaxNumber(int maxNumber) {
        this.maxNumberOfPassengers = maxNumber;
    }

    @Override
    public String toString() {
        return "CruiseShip{ name = " + super.getName() + " ,maxNumber=" + maxNumberOfPassengers + '}';
    }
    
    
    
}
