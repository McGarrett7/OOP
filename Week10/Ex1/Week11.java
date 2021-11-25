package Week10.Ex1;

import java.util.Comparator;
import java.util.List;

public class Week11 {

    /**
     * a.
     * a.
     */
    public static <T> List<T> sortGeneric(List<T> list) {
        if (list.get(0) instanceof Person) {
            list.sort(new Comparator<T>() {
                @Override
                public int compare(T a, T b) {
                    if (a instanceof Person && b instanceof Person) {
                        Person p1 = (Person) a;
                        Person p2 = (Person) b;

                        if (p1.getName().compareTo(p2.getName()) > 0) {
                            return 1;
                        } else if (p1.getName().compareTo(p2.getName()) < 0) {
                            return -1;
                        }

                        if (p1.getAge() > p2.getAge()) {
                            return 1;
                        } else if (p1.getAge() < p2.getAge()) {
                            return -1;
                        } else {
                            return 0;
                        }
                    }
                    return 0;
                }
            });
        } else {
            list.sort(null);
        }
        return list;
    }
}