package lr2;

interface Shape {
    double calculateArea();
    double calculatePerimeter();
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
    public void displayInfo() {
        System.out.println("Круг:");
        System.out.println("Радиус: " + radius);
        System.out.println("Площадь: " + calculateArea());
        System.out.println("Периметр: " + calculatePerimeter());
    }
}

class Square implements Shape {
    private double side;
    public Square(double side) {
        this.side = side;
    }
    @Override
    public double calculateArea() {
        return side * side;
    }
    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }
    public void displayInfo() {
        System.out.println("Квадрат:");
        System.out.println("Сторона: " + side);
        System.out.println("Площадь: " + calculateArea());
        System.out.println("Периметр: " + calculatePerimeter());
    }
}

class Triangle implements Shape {
    private double side1;
    private double side2;
    private double side3;
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    @Override
    public double calculateArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
    public void displayInfo() {
        System.out.println("Треугольник:");
        System.out.println("Сторона 1: " + side1);
        System.out.println("Сторона 2: " + side2);
        System.out.println("Сторона 3: " + side3);
        System.out.println("Площадь: " + calculateArea());
        System.out.println("Периметр: " + calculatePerimeter());
    }
}

public class Example6 {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Square square = new Square(4.0);
        Triangle triangle = new Triangle(3.0, 4.0, 5.0);
        circle.displayInfo();
        System.out.println();
        square.displayInfo();
        System.out.println();
        triangle.displayInfo();
    }
}