package Week7;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String address;
    List<Vehicle> vehicleList = new ArrayList<>();

    /**
     * pet.
     * @param name a.
     * @param address a.
     */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    /**
     * a.
     * @param vehicle a.
     */
    public void addVehicle(Vehicle vehicle) {
            vehicleList.add(vehicle);
    }

    /**
     * a.
     * @param registrationNumber a.
     */
    public void removeVehicle(String registrationNumber) {
        for (int i = 0; i < vehicleList.size(); i++) {
            if (vehicleList.get(i).getRegistrationNumber().equals(registrationNumber)) {
                vehicleList.remove(vehicleList.get(i));
                break;
            }
        }
    }

    /**
     * a.
     * @return a.
     */
    public String getVehiclesInfo() {
        if (vehicleList.isEmpty()) {
            return name + " has no vehicle!";
        } else {
            String inf = name + " has:\n\n";
            for (int i = 0; i < vehicleList.size(); i++) {
                inf += vehicleList.get(i).getInfo() + "\n";
            }
            return inf;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return name + " - " + address;
    }
}