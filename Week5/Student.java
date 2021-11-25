package Week5;

public class Student extends Person {
    private String program;
    private int year;
    private double fee;
    private String name;

    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public String getProgram() {
        return this.program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return this.fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public String toString() {
        return "Student[Person[name=" + getName()
                + ",address=" + getAddress()
                + "],program=" + program
                + ",year=" + year
                + ",fee=" + fee + "]";
    }

    public static void main(String[] args){
        Student a = new Student("Tung", "Viet Nam", "CLC", 2021, 100);
        System.out.print(a.toString());
    }
}