public class MyPoint {
    private int x;
    private int y;

    // no arg constructor = default (0,0)
    MyPoint() {
        x = 0;
        y = 0;
    }

    // parameterized constructor
    MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // member method named distance
    // that calculated and returns the distance between
    // MyPoint object and another point
    public double distance(int x, int y) {
        return Math.sqrt((y2 - y1) + (y2 - y1) + (x2 - x1) + (x2 - x1));
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}