package week10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main pStudio = new Main();
        pStudio.j055();
    }

    void j051() {
        int length = 0;
        int amount = 0;
        Scanner in = new Scanner(System.in);
        length = in.nextInt();
        amount = in.nextInt();
        MakePW makePW = new MakePW();
        makePW.make(length, amount);

    }

    void j052() {
        Score score = new Score(5);
        score.getScore();
        score.printScore();
    }

    void j053() {
        Score score = new Score(5);
        score.getScore();
        int num = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("찾고싶은 학생의 번호 : ");
        num = in.nextInt();
        score.printScore(num);
    }

    void j054() {
        Score score = new Score(5);
        score.getScore();
        int num = 0;
        String classname = "";
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        classname = in.nextLine();
        score.printScore(num, classname);
    }

    void j055() {
        BMICalculator calbmi = new BMICalculator();
        calbmi.getHW();
        calbmi.printBMI();
    }

    void bj() {
        BlackJackDeck bj = new BlackJackDeck(4);
        System.out.println("1st Trial");
        System.out.println(bj.toString());
        bj.suffle();
        System.out.println("2nd Trial");
        System.out.println(bj.toString());

        NewBlackJackDeck newBj = new NewBlackJackDeck(4);
        System.out.println("1st Trial");
        System.out.println(newBj.toString());
        newBj.suffle();
        System.out.println("2nd Trial");
        System.out.println(newBj.toString());
    }

}