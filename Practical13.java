class Shape {
    double d1, d2;
    void getData(double a, double b) {
        d1 = a;
        d2 = b;
    }
}
class Triangle extends Shape {
    double getArea() {
        return 0.5 * d1 * d2;
    }
}
class Rectangle extends Shape {
    double getArea() {
        return d1 * d2;
    }
}
public class Main {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.getData(5, 10);
        System.out.println("Triangle Area: " + t.getArea());

        Rectangle r = new Rectangle();
        r.getData(4, 6);
        System.out.println("Rectangle Area: " + r.getArea());
    }
}
