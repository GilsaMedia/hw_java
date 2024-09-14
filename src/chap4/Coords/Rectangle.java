package chap4.Coords;

public class Rectangle {
    private Point bottomLeft;
    private Point topRight;
    private int width;
    private int height;

    /**
     * A constructor for two points
     */
    public Rectangle(Point bottomLeft, Point topRight) {
            this.bottomLeft = new Point(bottomLeft.getX(), bottomLeft.getY());
            this.topRight = new Point(topRight.getX(), topRight.getY());
            calculateMissingInfo(this.topRight, this.width, this.height);
    }

    /**
     * A constructor for one point width and the height
     */
    public Rectangle(Point bottomLeft, int width, int height) {
        this.bottomLeft = new Point(bottomLeft.getX(), bottomLeft.getY());
        this.topRight = new Point();
        this.width = width;
        this.height = height;
        calculateMissingInfo(this.topRight, this.width, this.height);
    }

    /**
     * Makes sure that all the missing info won't be missing
     */
    private void calculateMissingInfo( Point topRight, int width, int height) {
        if (this.topRight.getX() == 0 && this.topRight.getY() == 0) {
            this.topRight.setX(this.bottomLeft.getX() + width);
            this.topRight.setY(this.bottomLeft.getY() + height);
        } else {
            this.width = this.topRight.getX() - this.bottomLeft.getX();
            this.height = this.topRight.getY() - this.bottomLeft.getY();

            if (this.width < 0) {
                this.width = -width;
            }
            if (this.height < 0) {
                this.height = -height;
            }
        }
    }

    /**
     * Getter for the area of the rectangle
     */
    public int getArea() {
        int area = width * height;
        return area;
    }

    /**
     * Getter for the perimeter of the rectangle
     */
    public int getPerimeter() {
        int perimeter = (2 * width) * (2 * height);
        return perimeter;
    }

    /**
     * Moves the rectangles how many integers
     */
    public void move(int deltaX, int deltaY) {
        bottomLeft.setX(this.bottomLeft.getX() + deltaX);
        topRight.setX(this.topRight.getX() + deltaX);

        bottomLeft.setY(this.bottomLeft.getY() + deltaY);
        topRight.setY(this.topRight.getY() + deltaY);
    }

    /**
     * A to string for the variables
     */
    @Override
    public String toString() {
        return "The Rectangle: \n" +
                "Point bottomLeft = " +
                "(<" + bottomLeft.getX() + ">," +
                "<" + bottomLeft.getY() + ">), " +
                "Point topRight = " +
                "(<" + topRight.getX() + ">," +
                "<" + topRight.getY() + ">), " +
                "Width = " + this.width + " " +
                "Height = " + this.height;
    }


}
