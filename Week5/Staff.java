package Week5;

public class Staff extends Person {
    private String school;
    private double pay;

    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.pay = pay;
        this.school = school;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public String toString() {
        return "Staff[Person[name=" + getName()
                + ",address=" + getAddress()
                + "],school=" + school
                + ",pay=" + pay + "]";
    }
    public static void main(String[] args){
        Staff a = new Staff("Tung", "Viet Nam", "UET", 100);
        System.out.print(a.toString());
    }
}