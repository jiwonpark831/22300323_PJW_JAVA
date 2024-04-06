package week5;

import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Main pStudio = new Main();
        pStudio.J013();
    }

    void J001() {
        int height, weight;
        double bmi;
        System.out.print("height(cm): ");
        Scanner in = new Scanner(System.in);
        height = in.nextInt();
        System.out.print("weight(kg): ");
        weight = in.nextInt();

        bmi = weight / (height * 0.01 * height * 0.01);
        String cut1 = String.format("%.1f", bmi);
        System.out.println("bmi : " + cut1);
    }

    void J002() {
        double c_degree;
        double f_degree;
        System.out.print("섭씨 온도 : ");
        Scanner in = new Scanner(System.in);
        c_degree = in.nextDouble();

        f_degree = c_degree * 1.8 + 32;
        System.out.println("화씨 온도 : " + f_degree);

    }

    void J003() {
        double m2_area;
        double pyung_area;
        System.out.print("아파트의 m^2 면적: ");
        Scanner in = new Scanner(System.in);
        m2_area = in.nextDouble();

        pyung_area = m2_area / 3.305;
        String pyungincut1 = String.format("%.1f", pyung_area);
        System.out.println("아파트의 평수 : " + pyungincut1);

    }

    void J004() {
        double x1, y1;
        double x2, y2;
        System.out.print("첫 번째 좌표 값: ");
        Scanner in = new Scanner(System.in);
        x1 = in.nextDouble();
        y1 = in.nextDouble();
        System.out.print("두 번째 좌표 값: ");
        x2 = in.nextDouble();
        y2 = in.nextDouble();

        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        String distancecut1 = String.format("%.1f", distance);
        System.out.println("두 좌표 사이의 거리: " + distancecut1);

    }

    int calculateDayNum(int month) {
        int returnValue = 31;
        switch (month) {
            case 2:
                returnValue = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                returnValue = 30;
                break;
            default:
                returnValue = 31;
                break;
        }
        return returnValue;
    }

    void J005() {
        int month, day;
        int tOrder = 0;

        System.out.print("Month : ");
        Scanner in = new Scanner(System.in);
        month = in.nextInt();
        System.out.print("Day : ");
        day = in.nextInt();

        for (int i = 0; i < month - 1; i++) {
            // tOrder += month_num[i];
            tOrder += calculateDayNum(i + 1);
        }
        tOrder += day;
        System.out.println("");
        System.out.println(month + "/" + day + " : " + tOrder + "!");
    }

    void J011() {
        int height, weight;
        double bmi;
        System.out.print("신장(cm) : ");
        Scanner in = new Scanner(System.in);
        height = in.nextInt();
        System.out.print("체중(kg) : ");
        weight = in.nextInt();

        bmi = weight / Math.pow(height * 0.01, 2);

        if (bmi >= 25.0)
            System.out.println("Yes");
        else
            System.out.println("No");

    }

    void J012() {
        double m2_area;
        double pyung_area;
        System.out.print("아파트의 m^2 면적: ");
        Scanner in = new Scanner(System.in);
        m2_area = in.nextDouble();

        pyung_area = m2_area / 3.305;
        String pyungincut1 = String.format("%.1f", pyung_area);
        System.out.println("아파트의 평수 : " + pyungincut1);

        if (pyung_area > 50)
            System.out.println("huge");
        else if (pyung_area >= 30)
            System.out.println("large");
        else if (pyung_area >= 15)
            System.out.println("normal");
        else
            System.out.println("small");

    }

    void J013() {
        int kor, eng, math;
        int total;
        double average;
        System.out.print("국어 영어 수학 점수 : ");
        Scanner in = new Scanner(System.in);
        kor = in.nextInt();
        eng = in.nextInt();
        math = in.nextInt();

        total = kor + eng + math;
        average = total / 3.0;
        String averagecut1 = String.format("%.1f", average);
        System.out.println("total : " + total + "  average : " + averagecut1);
        if (kor > 70)
            System.out.println("Korean - Pass");
        else
            System.out.println("Korean - Fail");
        if (eng > 70)
            System.out.println("English - Pass");
        else
            System.out.println("English - Fail");
        if (math > 70)
            System.out.println("Math - Pass");
        else
            System.out.println("Math - Fail");

    }
}
