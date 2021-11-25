package Week7;

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person("Tung", "HN");
        Person p2 = new Person("Nguyen Van A", "144 Xuan Thuy, Cau Giay, HN");
        Vehicle car = new Car("Mercedes-Benz", "S400", "30A - 888.88", p2, 4);
        Vehicle motor = new MotorBike("Yamaha", "YZF-R6", "29 - P1 686.68", p2, false);
        p2.addVehicle(car);
        p2.addVehicle(motor);
        //System.out.println(p1.getVehiclesInfo());
//        System.out.println(car.getInfo());
//        System.out.println(moto.getInfo());
        System.out.println(p2.getVehiclesInfo());

        p2.removeVehicle("29 - P1 686.68");
        //System.out.println(p2.getVehiclesInfo());
        car.transferOwnership(p1);
        //motor.transferOwnership(p2);
        //System.out.println(p2.getVehiclesInfo());
        System.out.println(p2.getVehiclesInfo());
    }
}