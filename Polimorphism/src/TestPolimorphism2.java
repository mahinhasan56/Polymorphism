
abstract class Polygon {

    int width, height;

    void set_values(int a, int b) {
        width = a;
        height = b;
    }

   abstract double area() ;
}

class Rectangle extends Polygon {

    double area() {
        return width * height;
    }

    int perimeter() {
        return 2 * (width + height);
    }
}

class Triangle extends Polygon {

    double area() {
        return width * height / 2;
    }
}

public class TestPolimorphism2 {

    public static void main(String args[]) {

        Polygon p1 = new Rectangle();
        Polygon p2 = new Triangle();
        p1.set_values(10, 20);
        p2.set_values(20, 30);
        System.out.println("Area of Rectangle " + p1.area());
        System.out.println("Area of Triangle " + p2.area());

        Rectangle r1 = (Rectangle) p1;


    }
}
