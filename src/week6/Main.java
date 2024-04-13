package week6;

import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Main pStudio = new Main();
        pStudio.J027();
    }

    void J021() {
        int total;
        int height, weight;
        double bmi;
        int people = 0;

        Scanner in = new Scanner(System.in);
        total = in.nextInt();

        for (int i = 0; i < total; i++) {
            height = in.nextInt();
            weight = in.nextInt();
            bmi = weight / (height * 0.01 * height * 0.01);
            if (bmi >= 25) {
                people++;
            }
        }
        System.out.println(people);
    }

    void J022() {
        double m2_area;
        double pyung_area;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            m2_area = in.nextDouble();
            pyung_area = m2_area / 3.305;
            if (pyung_area > 50)
                count4++;
            else if (pyung_area >= 30)
                count3++;
            else if (pyung_area >= 15)
                count2++;
            else
                count1++;
        }
        System.out.println("small: " + count1);
        System.out.println("normal: " + count2);
        System.out.println("large: " + count3);
        System.out.println("huge: " + count4);
    }

    void J023() {
        int count;
        int number;
        int totalsum = 0;
        double average;
        Scanner in = new Scanner(System.in);
        count = in.nextInt();
        for (int i = 0; i < count; i++) {
            number = in.nextInt();
            totalsum += number;
        }
        average = totalsum / count;
        System.out.println(totalsum + " " + average);
    }

    void J026() {
        int count;
        int number;
        int max_num = 0;
        int min_num = 99;
        Scanner in = new Scanner(System.in);
        count = in.nextInt();

        for (int i = 0; i < count; i++) {
            number = in.nextInt();
            if (number > max_num)
                max_num = number;
            if (number < min_num)
                min_num = number;
        }
        System.out.println("가장 큰 수 " + max_num);
        System.out.println("가장 작은 수 " + min_num);
    }

    void J027() {
        int total = 0;
        Scanner in = new Scanner(System.in);
        total = in.nextInt();

        int[] height = new int[total];
        int[] weight = new int[total];
        double[] bmi = new double[total];

        int count = 0;
        for (int i = 0; i < total; i++) {
            height[i] = in.nextInt();
            weight[i] = in.nextInt();
            bmi[i] = weight[i] / (height[i] * 0.01 * height[i] * 0.01);
            if (bmi[i] >= 25) {
                count++;
            }
        }
        System.out.print("Overweight person: ");
        for (int i = 0; i < total; i++) {
            if (bmi[i] >= 25)
                System.out.print((i + 1) + " ");
        }
        System.out.println("\nTotal: " + count);
    }

}