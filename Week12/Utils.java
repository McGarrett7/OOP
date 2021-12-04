package Week12;

import java.io.*;

public class Utils {

    public static String readContentFromFile(String path) {
        String result = "";

        try {
            FileInputStream file = new FileInputStream(path);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(file));

            String temp;
            while ((temp = bufferedReader.readLine()) != null) {
                result += temp + "\n";
            }

            bufferedReader.close();
        }
        catch (IOException e) {
           e.printStackTrace();
        }

        return result;
    }

    public static void writeContentToFile(String path, String content, boolean append) {
        try {
            FileWriter fileWriter = new FileWriter(path, append);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(content);

            bufferedWriter.close();
            fileWriter.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static File findFileByName(String folderPath, String fileName) {
        File file = new File(folderPath + File.separator + fileName);
        if (file.exists()) return file;
        return null;
    }

    public static void main(String[] args) {
       Utils.writeContentToFile("F:\\CodeUET\\Java\\OOP\\src\\Week12\\test.txt", "Hello", false);
//        Utils.writeContentToFile("F:\\CodeUET\\Java\\OOP\\src\\Week12\\test.txt", "Son Tung", false);
//       Utils.writeContentToFile("F:\\CodeUET\\Java\\OOP\\src\\Week12\\test.txt", "Son Tung", true);

       System.out.println(Utils.readContentFromFile("F:\\CodeUET\\Java\\OOP\\src\\Week12\\test.txt"));
//       System.out.println(Utils.findFileByName("F:\\CodeUET\\Java\\OOP\\src\\Week12", "test.txt"));
        }
    }