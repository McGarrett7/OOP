package Week3;

import java.util.*;

public class Prime {

    public static boolean isPrime(int a) {
        if (a <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
            if (isPrime(n)) {
                System.out.print(n + " is Prime");
            }
            else System.out.print(n + " is not Prime");
        }
    }
