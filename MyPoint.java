
public class MyPoint {
    private double x;
    private double y;

    public MyPoint() {
        x = 0;
        y = 0;
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public static double distance(MyPoint mp1, MyPoint mp2) {
        double mp_x = (mp1.x - mp2.x) * (mp1.x - mp2.x);
        double mp_y = (mp1.y - mp2.y) * (mp1.y - mp2.y);
        double distance = Math.sqrt(mp_x + mp_y);
        return distance;
    }
}
