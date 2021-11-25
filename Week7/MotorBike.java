package Week7;

public class MotorBike extends Vehicle {
    private boolean hasSidecar;

    /**
     * pet.
     * @param brand a.
     * @param model a.
     * @param registrationNumber a.
     * @param owner a.
     * @param hasSidecar a.
     */
    public MotorBike(String brand, String model, String registrationNumber,
                     Person owner, boolean hasSidecar) {
        super(brand, model, registrationNumber, owner);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public String getInfo() {
        return "Motor Bike:\n"
                + "\tBrand: " + this.brand + "\n"
                + "\tModel: " + this.model + "\n"
                + "\tRegistration Number: "
                + this.registrationNumber + "\n"
                + "\tHas Side Car: " + hasSidecar
                + "\n" + "\tBelongs to " + owner.getName()
                + " - " + owner.getAddress();
    }

    /**
     * a.
     * @return a.
     */
    public boolean isHasSidecar() {
        return hasSidecar;
    }

    /**
     * a.
     * @param hasSidecar a.
     */
    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }
}