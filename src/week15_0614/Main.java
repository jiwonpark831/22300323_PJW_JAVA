package week15_0614;

public class Main {
    public static void main(String[] args) {
        Child child = new Child("child", 5, 5);
        Parent parent = new Parent("parent", 30, 3);
        GrandParent grandParent = new GrandParent("parent", 60, 1);

        System.out.println("처음 위치");
        child.print();
        parent.print();
        grandParent.print();

        child.walk(1, 1);
        parent.walk(1, 1);
        grandParent.walk(1, 1);

        System.out.println("\n걸을 수 있는 사람 위치 업데이트");
        child.print();
        parent.print();
        grandParent.print();

        child.run(2, 2);
        parent.run(2, 2);
        System.out.println("\n뛸 수 있는 사람 위치 업데이트");
        child.print();
        parent.print();
        grandParent.print();

        child.swim(3, -1);
        System.out.println("\n수영할 수 있는 사람 위치 업데이트");
        child.print();
        parent.print();
        grandParent.print();

    }
}
