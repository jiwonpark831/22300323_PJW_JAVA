package week12;

import java.util.ArrayList;
import java.util.List;

public class TodoCrud implements ICrud {
    List<TodoItem> list = new ArrayList<>();

    public void create(String title, String content, String date) {
        // list.add(new TodoItem(title, content, date));
        create(new TodoItem(title, content, date));
    }

    public int indexTodoItem(TodoItem todoItem) {
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            if (todoItem.getTitle().equals(list.get(i).getTitle())
                    && todoItem.getDate().equals(list.get(i).getDate())) {
                index = i;
            }
        }
        return index;
    }

    public void create(TodoItem todoItem) {
        int index = indexTodoItem(todoItem);
        if (index == -1) {
            list.add(todoItem);
        }
    }

    public void update(int index, String title, String content, String date) {
        TodoItem each = list.get(index);
        each.setTitle(title);
        each.setContent(content);
        each.setDate(date);
    }

    public void update(int index, TodoItem todoItem) {
        update(index, todoItem.getTitle(),
                todoItem.getContent(),
                todoItem.getDate());
        /*
         * TodoItem each = list.get(index);
         * each.setTitle(todoItem.getTitle());
         * each.setContent(todoItem.getContent());
         * each.setDate(todoItem.getDate());
         */
    }

    public void delete(int index) {
        list.remove(index);
    }

    public void delete(TodoItem todoItem) {
        // list.remove(index);
        // list.remove(todoItem);

        int index = indexTodoItem(todoItem);
        if (index > -1) {
            list.remove(index);
        }
    }

    public void printThis() {
        for (TodoItem each : list) {
            System.out.println(each.toString());
        }
    }

    public void printThis(String date) {
        for (TodoItem each : list) {
            if (date.equals(each.getDate())) {
                System.out.println(each.toString());
            }
        }
    }

    public List<TodoItem> listSchedule(String date) {
        List<TodoItem> rlist = new ArrayList<>();
        for (TodoItem each : list) {
            if (date.equals(each.getDate())) {
                rlist.add(each);
            }
        }
        return rlist;
    }

    public int countSchedule(String date) {
        int count = 0;
        for (TodoItem each : list) {
            if (date.equals(each.getDate())) {
                count++;
            }
        }
        return count;
    }
}