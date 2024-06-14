package week15_0614;

public class GrandParent extends Human implements Walkable {
    public GrandParent(String name, int age, int speed) {
        super(name, age, speed);
    }

    @Override
    public void walk(int x, int y) {
        this.x = x;
        this.y = y;
    }

}
