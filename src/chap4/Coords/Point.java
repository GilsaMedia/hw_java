package chap4.Coords;

public class Point {
    private Point p1;
    private int x;
    private int y;

    /**
     * A constructor for the class
     * receives parameters with values for all attributes.
     * builds a new Point according to these coords
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * The copy constructor
     */
    public Point(Point p1) {
        this.x = this.getX();
        this.y = this.getY();
    }

    /**
     * The default constructor
     */
    public Point() {
        this.x = 0;
        this.y = 0;
    }

    /**
     * A getter for the coords of a point
     */
    public Point getPoint() {
        Point p1 = new Point(this.getX(), this.getY());
        return p1;
    }

    /**
     * A getter for the X of the point
     */
    public int getX() {
        return x;
    }

    /**
     * A setter for the X of point
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * A getter for the Y of the point
     */
    public int getY() {
        return y;
    }

    /**
     * A setter of the Y of a point
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * To string for the variables of the point
     */
    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
