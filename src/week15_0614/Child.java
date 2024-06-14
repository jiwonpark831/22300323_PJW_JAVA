package week15_0614;

public class Child extends Human implements Walkable, Runnable, Swimmable {
    public Child(String name, int age, int speed) {
        super(name, age, speed);

    }

    @Override
    public void walk(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void run(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void swim(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
