public class MyPointTest {
    public static void main(String[] args) {
        MyPoint myPoint = new MyPoint(0,0);
        MyPoint myPoint1 = new MyPoint(10, 30.5);
        double len = MyPoint.distance(myPoint1,myPoint);
        System.out.println(len);
    }
}
