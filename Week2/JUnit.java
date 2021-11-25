package Week2;

public class JUnit {
    /**
     * so sanh 2 so
     * @param a
     * @param b
     * @return max of $a and $b
     */
    public static int max2Int(int a, int b) {
        return (a > b) ? a : b;
    }

    /**
     * tim so be nhat
     * @param arr
     * @return min of array $arr
     */
    public static int minArray(int[] arr) {
        int min = arr[0];
        for (int i : arr) {
            if (i < min) min = i;
        }
        return min;
    }

    /**
     * tinh bmi
     * @param weight: in kg
     * @param height: in m
     * @return BMI index
     */
    public static String calculateBMI(double weight, double height) {
        double bmi = weight / (height * height);
        bmi = (double)Math.round(   bmi * 10) / 10;
        if (bmi < 18.5) return "Thiếu cân";
        else if (bmi <= 22.9) return "Bình thường";
        else if (bmi <= 24.9) return "Thừa cân";
        else return "Béo phì";
    }
}