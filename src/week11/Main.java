package week11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main pStudio = new Main();
        pStudio.runTodo();
    }

    public void runWord() {
        int menu, quit = 0;
        Scanner s = new Scanner(System.in);
        WordCRUD manager = new WordCRUD();
        while (true) {
            System.out.println("Menu> 1.Add 2.Edit 3.List 4.Delete 0.Exit");
            menu = s.nextInt();
            switch (menu) {
                case 1:
                    manager.addWord();
                    break;
                case 2:
                    manager.editWord();
                    break;
                case 3:
                    manager.listWord();
                    break;
                case 4:
                    manager.deleteWord();
                    break;
                default:
                    quit = 1;
            }
            if (quit == 1)
                break;
        }
    }

    public void runBook() {
        int menu, quit = 0;
        Scanner s = new Scanner(System.in);
        BookCRUD manager = new BookCRUD();
        while (true) {
            System.out.println("Menu> 1.Add 2.Edit 3.List 4.Delete 0.Exit");
            menu = s.nextInt();
            switch (menu) {
                case 1:
                    manager.addBook();
                    break;
                case 2:
                    manager.editBook();
                    break;
                case 3:
                    manager.listBook();
                    break;
                case 4:
                    manager.deleteBook();
                    break;
                default:
                    quit = 1;
            }
            if (quit == 1)
                break;
        }
    }

    public void runTodo() {
        int menu, quit = 0;
        Scanner s = new Scanner(System.in);
        TodoCRUD manager = new TodoCRUD();
        while (true) {
            System.out.println("Menu> 1.Add 2.Edit 3.List 4.Delete 0.Exit");
            menu = s.nextInt();
            switch (menu) {
                case 1:
                    manager.addTodo();
                    break;
                case 2:
                    manager.editTodo();
                    break;
                case 3:
                    manager.listTodo();
                    break;
                case 4:
                    manager.deleteTodo();
                    break;
                default:
                    quit = 1;
            }
            if (quit == 1)
                break;
        }
    }
}
