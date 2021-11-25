package Week9;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Week8Task2 {

    /**
     * a.
     * a.
     */
    public int nullPointerEx() throws NullPointerException {
        Week8Task2 a = null;
        return a.arrayIndexOutOfBoundsEx();
    }

    /**
     * a.
     * a.
     */
    public String nullPointerExTest() {
        try {
            nullPointerEx();
        } catch (NullPointerException e) {
            return "Lỗi Null Pointer";
        }
        return "Không có lỗi";
    }

    public int arrayIndexOutOfBoundsEx() throws ArrayIndexOutOfBoundsException {
        int[] a = new int[2];
        return a[10];
    }

    /**
     * a.
     * a.
     */

    public String arrayIndexOutOfBoundsExTest() {
        try {
            arrayIndexOutOfBoundsEx();
        } catch (ArrayIndexOutOfBoundsException e) {
            return "Lỗi Array Index Out of Bounds";
        }
        return "Không có lỗi";
    }

    /**
     * a.
     * a.
     */

    public void arithmeticEx() {
        int a = 7;
        System.out.print(a / 0);
    }

    /**
     * a.
     * a.
     */

    public String arithmeticExTest() {
        try {
            arithmeticEx();
        } catch (Exception e) {
            return "Lỗi Arithmetic";
        }
        return "Không có lỗi";
    }

    public void fileNotFoundEx() throws FileNotFoundException {
        FileReader file = new FileReader("test.txt");
    }

    /**
     * a.
     * a.
     */

    public String fileNotFoundExTest() {
        try {
            fileNotFoundEx();
        } catch (FileNotFoundException e) {
            return "Lỗi File Not Found";
        }
        return "Không có lỗi";
    }

    public void ioEx() throws IOException {
        FileReader file = new FileReader("test.txt");
    }

    /**
     * a.
     * a.
     */

    public String ioExTest() {
        try {
            ioEx();
        } catch (Exception e) {
            return "Lỗi IO";
        }
        return "Không có lỗi";
    }

    public static void main(String[] args) {
        Week8Task2 test = new Week8Task2();

        System.out.println(test.nullPointerExTest());
        System.out.println(test.arrayIndexOutOfBoundsExTest());
        System.out.println(test.arithmeticExTest());
        System.out.println(test.fileNotFoundExTest());
        System.out.println(test.ioExTest());
    }
}