package week11;

public class Book {
    private String name, auth, cate;
    private int price, year;

    public Book(String name) {
        this.name = name;
    }

    public Book(String name, String auth, String cate, int price, int year) {
        this.name = name;
        this.auth = auth;
        this.cate = cate;
        this.price = price;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuth() {
        return auth;
    }

    public void setAuth(String auth) {
        this.auth = auth;
    }

    public String getCate() {
        return cate;
    }

    public void setCate(String cate) {
        this.cate = cate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        return name + " - " + auth + ", " + cate + " " + price + "원 (" + year + ")";
    }
}
