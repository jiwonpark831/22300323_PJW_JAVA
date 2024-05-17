package week11;

import java.util.ArrayList;
import java.util.Scanner;

public class TodoCRUD {
    ArrayList<Todo> list;

    public TodoCRUD() {
        list = new ArrayList<Todo>();
    }

    void addTodo() {
        String name, content, cate;
        int date;
        Scanner s = new Scanner(System.in);
        System.out.print("Todo name > ");
        name = s.nextLine();
        System.out.print("Todo contents > ");
        content = s.nextLine();
        System.out.print("Cate > ");
        cate = s.nextLine();
        System.out.print("Date left.. > ");
        date = s.nextInt();
        Todo new_Todo = new Todo(name, content, cate, date);
        list.add(new_Todo);
    }

    void editTodo() {
        Scanner s = new Scanner(System.in);
        String findTodo;
        System.out.print("Todo name > ");
        findTodo = s.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(findTodo)) {
                System.out.print("edit contents > ");
                String newContent;
                newContent = s.nextLine();
                list.get(i).setContent(newContent);
                System.out.print("edit date left > ");
                int newDate;
                newDate = s.nextInt();
                list.get(i).setDate(newDate);
            }
        }
    }

    void listTodo() {
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%d. %s\n", i + 1, list.get(i).toString());
        }
    }

    void deleteTodo() {
        Scanner s = new Scanner(System.in);
        String findTodo;
        System.out.print("Todo name > ");
        findTodo = s.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(findTodo))
                list.remove(i);

        }
    }
}
