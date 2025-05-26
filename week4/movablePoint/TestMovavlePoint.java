package week4.movablePoint;

public class TestMovavlePoint {
    public static void main(String[] args) {
        MovablePoint mp1 = new MovablePoint();
        System.out.println("Default MovablePoint: " + mp1);

        MovablePoint mp2 = new MovablePoint(3.0f, 4.0f, 1.5f, 2.5f);
        System.out.println("MovablePoint with params: " + mp2);

        mp2.move();
        System.out.println("After move: " + mp2);

        mp2.setSpeed(2.0f, 3.0f);
        mp2.move();
        System.out.println("After setSpeed and move: " + mp2);
    }
}
