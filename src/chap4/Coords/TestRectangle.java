package chap4.Coords;

public class TestRectangle {
    public static void main(String[] args) {
        Point p1 = new Point(1, 3);
        Point p2 = new Point(6,7);

        Point p3 = new Point(3,3);

        Rectangle r1 = new Rectangle(p1, p2);
        Rectangle r2 = new Rectangle(p3, 6, 3);

        System.out.println(r1.toString());
        System.out.println(r2.toString());
    }
}
