package week12;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main pStudio = new Main();
        pStudio.j071();
    }

    void j071() {
        ICrud a = new TodoCrud();
        String menu;
        String title, content, date;
        int quit = 0;
        Scanner s = new Scanner(System.in);
        printMenu();
        while (true) {
            System.out.print("> ");
            menu = s.nextLine();
            switch (menu) {
                case "add":
                    System.out.println("Add a Todo item");
                    System.out.print("Enter the title: ");
                    title = s.nextLine();
                    System.out.print("Enter the detail: ");
                    content = s.nextLine();
                    System.out.print("Enter the detail: ");
                    date = s.nextLine();

                    a.create(title, content, date);
                    System.out.println("Item added");
                    break;
                case "del":
                    System.out.println("Delete a Todo Item");
                    System.out.print("Enter the title of the item to remove: ");
                    title = s.nextLine();
                    int found = 0;
                    for (int i = 0; i < ((TodoCrud) a).list.size(); i++)
                        if (((TodoCrud) a).list.get(i).getTitle().equals(title)) {
                            {
                                TodoItem todoItem = ((TodoCrud) a).list.get(i);
                                System.out.print("[" + ((TodoCrud) a).list.get(i).getTitle() + "] "
                                        + ((TodoCrud) a).list.get(i).getContent() + " - "
                                        + ((TodoCrud) a).list.get(i).getDate());
                                a.delete(todoItem);
                                found = 1;
                                System.out.println("Item deleted");
                                break;
                            }
                        }
                    if (found == 0)
                        System.out.println("Not found");
                    break;
                case "edit":
                    System.out.println("Edit a Todo item");
                    System.out.print("Enter the title of the item to edit: ");
                    title = s.nextLine();
                    int founde = 0;
                    for (int i = 0; i < ((TodoCrud) a).list.size(); i++) {
                        if (((TodoCrud) a).list.get(i).getTitle().equals(title)) {
                            System.out.print("[" + ((TodoCrud) a).list.get(i).getTitle() + "] "
                                    + ((TodoCrud) a).list.get(i).getContent() + " - "
                                    + ((TodoCrud) a).list.get(i).getDate());
                            System.out.print("Enter the detail: ");
                            content = s.nextLine();
                            System.out.print("Enter the date: ");
                            date = s.nextLine();
                            a.update(i, title, content, date);
                            founde = 1;
                            System.out.println("Item updated");
                            break;
                        }
                    }
                    if (founde == 0)
                        System.out.println("Not found");
                    break;
                case "ls":
                    a.printThis();
                    break;
                case "ls name":
                    Collections.sort(((TodoCrud) a).list, Comparator.comparing(TodoItem::getTitle));
                    a.printThis();
                    break;
                case "ls name desc":
                    Collections.sort(((TodoCrud) a).list, Comparator.comparing(TodoItem::getTitle).reversed());
                    a.printThis();
                    break;
                case "ls date":
                    Collections.sort(((TodoCrud) a).list, Comparator.comparing(TodoItem::getDate));
                    a.printThis();
                    break;
                case "ls date desc":
                    Collections.sort(((TodoCrud) a).list, Comparator.comparing(TodoItem::getDate).reversed());
                    a.printThis();
                    break;
                case "?":
                    printMenu();
                    break;
                case "exit":
                    quit = 1;
                    break;
                default:
            }
            if (quit == 1)
                break;
        }

    }

    public void printMenu() {
        System.out.println("1. Add a new item (add)");
        System.out.println("2. Delete an existing item (del)");
        System.out.println("3. Update an item (edit)");
        System.out.println("4. List all items (ls)");
        System.out.println("5. Sort the list by name (ls name)");
        System.out.println("6. Sort the list by name descending (ls name desc)");
        System.out.println("7. Sort the list by date (ls date)");
        System.out.println("8. Sort the list by date descending (ls date desc)");
        System.out.println("9. Show commands guidelines (?)");
        System.out.println("10. Quit program (exit)");
    }
}