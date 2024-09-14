package chap4.Coords;

public class TestPoint {
    public static void main(String[] args) {
        Point sleep = new Point(43, 7);
        Point please = new Point(5, 5);

//        System.out.println(sleep.toString());
//        System.out.println(please.toString());

        int sleep_x = sleep.getX();
        int please_x = please.getX();

        sleep.setX(please_x);
        please.setX(sleep_x);

//        System.out.println(sleep.toString());
//        System.out.println(please.toString());


        Point p1 = new Point(4, 9);
        Point p2 = p1;

        Point p3 = new Point(p1);

        p2.setX(5);
        p3.setY(8);

//        System.out.println(p1.toString());
//        System.out.println(p2.toString());
//        System.out.println(p3.toString());


    }
}
