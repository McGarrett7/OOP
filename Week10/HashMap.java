package Week10;

import java.util.Map;
import java.util.Set;

public class HashMap {
        public static void main(String[] args) {
            Map map = new java.util.HashMap();

            map.put(null, null);
//            System.out.println("null: " + map.get(null));
            map.put(null, 7);
//            System.out.println("null: " + map.get(null));
            Set<Integer> keySet = map.keySet();
            for (Integer key : keySet) {
                System.out.println(key + " - " + map.get(key));
            }
        }
    }
