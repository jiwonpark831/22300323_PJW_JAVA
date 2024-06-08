package week14;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main pStudio = new Main();
        pStudio.j092();
    }

    void j091() {
        ScoreManager scoreManager = new ScoreManager();
        Scanner scanner = new Scanner(System.in);
        int exit = 0;
        while (exit != 1) {
            System.out.print("1.점수통계출력 2.학생검색 3.학생점수수정 4.종료 > ");
            int menu = scanner.nextInt();
            scanner.nextLine();
            if (menu == 1)
                scoreManager.print();
            else if (menu == 2) {
                String name = scanner.nextLine();
                scoreManager.search(name);
            } else if (menu == 3) {
                String name = scanner.nextLine();
                scoreManager.modify(name);
            } else if (menu == 4) {
                System.out.println("bye!");
                exit = 1;
            }
        }
    }

    void j092() {
        CarManager carManager = new CarManager();
        Scanner scanner = new Scanner(System.in);
        int exit = 0;
        while (exit != 1) {
            System.out.print("1.enter 2.exit 3.list 4.quit > ");
            int menu = scanner.nextInt();
            scanner.nextLine();
            if (menu == 1) {
                System.out.print("Enter number, type > ");
                String number = scanner.next();
                String type = scanner.next();
                carManager.enter(number, type);
            } else if (menu == 2) {
                System.out.print("Enter car number to exit > ");
                String number = scanner.nextLine();
                carManager.calculatefee(number);
            } else if (menu == 3) {
                carManager.print();
            } else if (menu == 4) {
                System.out.println("bye!");
                exit = 1;
            }
        }
    }

}