package week15_0614;

public class Parent extends Human implements Walkable, Runnable {
    public Parent(String name, int age, int speed) {
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
}
