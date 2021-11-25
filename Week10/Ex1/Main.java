package Week10.Ex1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String[] args) {
        Person p1 = new Person("Son Tung M-TP", 27, "VN");
        Person p2 = new Person("Manchester United", 70, "England");
        Person p3 = new Person("Ronaldo", 36, "Portugal");
        Person p4 = new Person("Son Tung M-TP", 28, "VN");

        List<Person> s = new ArrayList<>();
        s.add(p1);
        s.add(p2);
        s.add(p3);
        s.add(p4);
        System.out.println(Week11.sortGeneric(s));
    }
}