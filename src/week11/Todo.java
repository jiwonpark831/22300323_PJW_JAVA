package week11;

public class Todo {
    private String name, content, cate;
    private int date;

    public Todo(String name) {
        this.name = name;
    }

    public Todo(String name, String content, String cate, int date) {
        this.name = name;
        this.content = content;
        this.cate = cate;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCate() {
        return cate;
    }

    public void setCate(String cate) {
        this.cate = cate;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String toString() {
        return name + " - " + content + "(category: " + cate + ")" + ", D-" + date;
    }
}
