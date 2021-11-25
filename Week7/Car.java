package Week7;

public class Car extends Vehicle {
    private int numberOfDoors;

    /**
     * a.
     * @param brand a.
     * @param model a.
     * @param registrationNumber a.
     * @param owner a.
     * @param numberOfDoors a.
     */
    public Car(String brand, String model, String registrationNumber,
               Person owner, int numberOfDoors) {
        super(brand, model, registrationNumber, owner);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String getInfo() {
        return "Car:\n"
                + "\tBrand: " + this.brand + "\n"
                + "\tModel: " + this.model + "\n"
                + "\tRegistration Number: " + this.registrationNumber + "\n"
                + "\tNumber of Doors: " + numberOfDoors + "\n"
                + "\tBelongs to " + owner.getName() + " - " + owner.getAddress();
    }

    /**
     * a.
     * @return a
     */
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    /**
     * a.
     * @param numberOfDoors a.
     */
    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}