package week13;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Main pStudio = new Main();
        pStudio.j085();
    }

    void j081() {
        String data = "";
        try {
            FileInputStream fileInputStream = new FileInputStream("./src/week13/j081.txt");
            int i = 0;
            while ((i = fileInputStream.read()) != -1) {
                System.out.print((char) i);
                data += (char) i + "";
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] arrayData = data.split(" ");
        int[] arrayDataInt = new int[arrayData.length];
        for (int i = 0; i < arrayData.length; i++) {
            try {
                arrayDataInt[i] = Integer.parseInt(arrayData[i]);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        int max = arrayDataInt[0];
        int min = arrayDataInt[0];
        for (int i = 1; i < arrayDataInt.length; i++) {
            if (arrayDataInt[i] > max) {
                max = arrayDataInt[i];
            }
            if (arrayDataInt[i] < min) {
                min = arrayDataInt[i];
            }
        }
        System.out.println("\nMaximum number : " + max);
        System.out.println("Minimum number : " + min);
    }

    void j082() {
        List<String> list = new ArrayList<>();
        int order = 0;
        double bmi;
        int bmiCount = 0;
        try {
            File file = new File("./src/week13/j082.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                order++;
                String line = scanner.nextLine();
                list.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < order; i++) {
            System.out.println(list.get(i));
            String[] arr = list.get(i).split(" ");
            int h = Integer.parseInt(arr[0]);
            int w = Integer.parseInt(arr[1]);
            bmi = w / ((h * 0.01) * (h * 0.01));
            // bmi
            // =Integer.parseInt(arr[1])/(Integer.parseInt(arr[0])*(Integer.parseInt(arr[0])));
            if (bmi > 25.0) {
                System.out.println(i + 1 + " is overweight");
                bmiCount++;
            }
        }
        System.out.println("All " + order + " persons");
        double percent = ((double) bmiCount / order) * 100;
        String percentString = String.format("%.0f", percent);
        System.out.println("Total overweight persons : " + bmiCount + "(" + percentString + "%)");
    }

    void j083() {

    }

    void j085() {
        String data = "";
        try {
            FileInputStream fileInputStream = new FileInputStream("./src/week13/j085.txt");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            int i = 0;
            while ((i = bufferedInputStream.read()) != -1) {
                data += (char) i + "";
            }
            fileInputStream.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println(data);
        int[] arrayNum = { 0, 0, 0 };
        for (int i = 0; i < data.length(); i++) {
            int each = data.charAt(i);
            // System.out.println(each);
            if (each >= 65 && each <= 90) {
                // 대문자
                arrayNum[0]++;
            }
            if (each >= 97 && each <= 122) {
                // 소문자
                arrayNum[1]++;
            }
            if (" ".equals(data.substring(i, i + 1))) {
                // 공백
                arrayNum[2]++;
            }
        }
        System.out.println("total - " + data.length());
        System.out.println("A~Z - " + arrayNum[0]);
        System.out.println("a~z - " + arrayNum[1]);
        System.out.println("spaces - " + arrayNum[2]);
        System.out.println("etc - " + (data.length() - arrayNum[0] - arrayNum[1] - arrayNum[2]));
    }
}