import java.util.*;

class Shape {
    double d1;
    double d2;

    void getData(double a, double b) {
        d1 = a;
        d2 = b;
    }
}

class Triangle extends Shape {
    double area() {
        return 0.5 * d1 * d2;
    }
}

class Rectangle extends Shape {
    double area() {
        return d1 * d2;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Triangle t = new Triangle();
        Rectangle r = new Rectangle();

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        t.getData(a, b);
        r.getData(a, b);

        System.out.println(t.area());
        System.out.println(r.area());
    }
}