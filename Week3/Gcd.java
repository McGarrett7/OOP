package Week3;

import java.util.*;

public class Gcd {

    public static int gcd(int a, int b) {
        if (b == 0) {
            if (a < 0) {
                return -a;
            } else {   // a >= 0
                return a;
            }
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(gcd(a,b));
        }
    }
}