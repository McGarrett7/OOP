package Week13.strategy;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(9);
        list.add(8);

        Context test = new Context(new SelectionSort());
        System.out.println(test.sort(list));
    }
}