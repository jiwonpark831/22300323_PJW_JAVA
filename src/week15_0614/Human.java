package week15_0614;

public class Human {
    public String name;
    public int age;
    public int speed;
    public int x;
    public int y;

    Human(String name, int age, int speed) {
        this.name = name;
        this.age = age;
        this.speed = speed;
        this.x = 0;
        this.y = 0;
    }

    public void print() {
        System.out.println(name + " - x: " + x + ", y: " + y);
    }
}
