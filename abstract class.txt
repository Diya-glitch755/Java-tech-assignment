abstract class Shape {
    abstract void calculate_area();

    void display_info() {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {
    double r = 5;

    void calculate_area() {
        double area = 3.14 * r * r;
        System.out.println("Area of Circle = " + area);
    }
}

class Rectangle extends Shape {
    int l = 6, b = 4;

    void calculate_area() {
        int area = l * b;
        System.out.println("Area of Rectangle = " + area);
    }
}

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();

        c.display_info();
        c.calculate_area();

        r.display_info();
        r.calculate_area();
    }
}
