package week11;

import java.util.ArrayList;
import java.util.Scanner;

public class BookCRUD {
    ArrayList<Book> list;

    public BookCRUD() {
        list = new ArrayList<Book>();
    }

    void addBook() {
        String name, auth, cate;
        int price, year;
        Scanner s = new Scanner(System.in);
        System.out.print("Book name > ");
        name = s.nextLine();
        System.out.print("Author > ");
        auth = s.nextLine();
        System.out.print("Category > ");
        cate = s.nextLine();
        System.out.print("Price > ");
        price = s.nextInt();
        System.out.print("Year > ");
        year = s.nextInt();
        Book new_book = new Book(name, auth, cate, price, year);
        list.add(new_book);
    }

    void editBook() {
        Scanner s = new Scanner(System.in);
        String findBook;
        System.out.print("Book name > ");
        findBook = s.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(findBook)) {
                System.out.print("edit Price > ");
                int newPrice;
                newPrice = s.nextInt();
                list.get(i).setPrice(newPrice);
            }
        }
    }

    void listBook() {
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%d. %s\n", i + 1, list.get(i).toString());
        }
    }

    void deleteBook() {
        Scanner s = new Scanner(System.in);
        String findBook;
        System.out.print("Book name > ");
        findBook = s.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(findBook))
                list.remove(i);

        }
    }
}
