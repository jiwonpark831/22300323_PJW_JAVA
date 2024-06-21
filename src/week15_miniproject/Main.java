package week15_miniproject;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main javaMiniProject = new Main();
        javaMiniProject.run();
    }

    public void printMenu() {
        System.out.print("\n1.Add 2.Read 3.Update 4.Delete 5.Search 6.Save 7.Sort 0.Exit > ");
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        MovieCrud manager = new MovieCrud();
        try {
            manager.loadData();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        boolean quit = false;
        do {
            printMenu();
            int menu = sc.nextInt();
            switch (menu) {
                case 1:
                    manager.addItem();
                    break;

                case 2:
                    manager.printAll();
                    break;

                case 3:
                    manager.updateItem();
                    break;

                case 4:
                    manager.deleteItem();
                    break;

                case 5:
                    manager.searchItem();
                    break;

                case 6:
                    try {
                        manager.saveItem();
                    } catch (IOException e) {
                        System.out.println("fail to save\n");
                    }
                    break;
                case 7:
                    int rora;
                    System.out.print("Sort by [1]rate, [2]audience > ");
                    rora = sc.nextInt();
                    if (rora == 1)
                        manager.sortByRate();
                    else
                        manager.sortAudience();
                    manager.printAll();
                    break;
                case 0:
                    quit = true;
                    break;

                default:
                    System.out.println("Wrong number.\n");
                    break;
            }
        } while (!quit);
    }
}