package Week3;

import java.util.Scanner;

public class Fibonacci {

    public static long a = Long.MAX_VALUE;
    private static long[] fibo = new long[101];
    private static boolean check = false;

    /**
     * set array fibo.
     */
    public static void setFibo() {
        fibo[0] = 0;
        fibo[1] = 1;
        for (int i = 2; i < 101; i++) {
            if (fibo[i - 1] + fibo[i - 2] > a) {
                fibo[i] = a;
            } else {
                fibo[i] = fibo[i - 1] + fibo[i - 2];
            }
        }
    }

    public static long fibonacci(long n) {
        if (!check) {
            setFibo();
            check = true;
        }
        if (n < 0) {
            return (long) -1;
        }
        return fibo[(int) n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(fibonacci(n) + " ");
    }

}