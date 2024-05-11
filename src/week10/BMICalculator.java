package week10;

import java.util.Scanner;

public class BMICalculator {
    int height, weight;
    double bmi;
    int level;
    String name;

    public BMICalculator() {
        height = 0;
        weight = 0;
        bmi = 0.0;
        name = "";
    }

    public void getHW() {
        Scanner in = new Scanner(System.in);
        name = in.nextLine();
        height = in.nextInt();
        weight = in.nextInt();
        bmi = weight / (height * 0.01 * height * 0.01);
        if (bmi < 18.5)
            level = 1;
        else if (bmi < 25)
            level = 2;
        else if (bmi < 30)
            level = 3;
        else
            level = 4;

    }

    public void printBMI() {
        System.out.println("name : " + name);
        System.out.println("height : " + height + "  weight : " + weight);
        System.out.println("bmi : " + bmi);
        System.out.println("bmi level : " + level);
    }
}