package week9;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lotto {
    private int[] numbers;

    public Lotto() {
        remakeAuto();
    }

    public int checkWin(Lotto w, Lotto t) {
        int match = 0;
        int[] arrayWin = w.getNumbers();
        int[] arrayTry = t.getNumbers();
        for (int j = 0; j < arrayTry.length; j++) {
            for (int i = 0; i < arrayWin.length; i++) {
                if (arrayTry[j] == arrayWin[i]) {
                    match++;
                }
            }
        }
        return match;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void printNumbers() {
        for (int each : numbers) {
            System.out.print(each + " ");
        }
        System.out.println("");
    }

    public void remake() {
        int[] tempNumbers = new int[6];
        for (int i = 0; i < tempNumbers.length; i++) {
            setNumber(tempNumbers, i, "manual");
        }
        Arrays.sort(tempNumbers);
        setNumbers(tempNumbers);
    }

    public void remakeAuto() {
        int[] tempNumbers = new int[6];
        // numbers = new int[6];
        for (int i = 0; i < tempNumbers.length; i++) {
            setNumber(tempNumbers, i, "auto");
        }
        Arrays.sort(tempNumbers);
        setNumbers(tempNumbers);
    }

    public boolean checkNumber(int[] array, int number) {
        boolean returnValue = true;
        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                returnValue = false;
            }
        }
        return returnValue;
    }

    public int inputNumber(int order) {
        int returnValue = 0;
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print((order + 1) + " num : ");
            returnValue = in.nextInt();
            if (returnValue >= 1 && returnValue <= 45) {
                break;
            } else {
                System.out.println("wrong number!!");
            }
        }
        return returnValue;
    }

    public void setNumber(int[] array, int order, String type) {
        Random rand = new Random();
        int tempValue = 0;
        while (true) {
            if ("auto".equals(type)) {
                tempValue = rand.nextInt(45) + 1;
            } else {
                tempValue = inputNumber(order);
            }
            if (checkNumber(array, tempValue)) {
                break;
            }
        }
        array[order] = tempValue;
    }
}