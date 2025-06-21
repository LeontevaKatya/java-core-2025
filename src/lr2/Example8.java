package lr2;

// Базовый класс животного
class Animal {
    private String name;
    private int age;
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // Метод для публикации звуков животным
    public void makeSound() {
        System.out.println("Животное издает звук");
    }
    @Override
    public String toString() {
        return "Имя: " + name + ", Возраст: " + age;
    }
}
// Подклассы
class Dog extends Animal {
    private String breed; // Порода собаки
    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }
    @Override
    public void makeSound() {
        System.out.println("Собака гавкает!");
    }
    @Override
    public String toString() {
        return super.toString() + ", Порода: " + breed;
    }
}
class Cat extends Animal {
    private boolean isIndoor; // Кошка домашняя?
    public Cat(String name, int age, boolean isIndoor) {
        super(name, age);
        this.isIndoor = isIndoor;
    }
    @Override
    public void makeSound() {
        System.out.println("Кошка мяукает!");
    }
    @Override
    public String toString() {
        return super.toString() + ", Домашняя кошка: " + isIndoor;
    }
}
class Bird extends Animal {
    private boolean canFly; // Способность летать
    public Bird(String name, int age, boolean canFly) {
        super(name, age);
        this.canFly = canFly;
    }
    @Override
    public void makeSound() {
        System.out.println("Птица чирикает!");
    }
    @Override
    public String toString() {
        return super.toString() + ", Может летать: " + canFly;
    }
}

// Базовый класс фигуры
abstract class Shape2 {
    abstract double calculateArea();
    abstract double calculatePerimeter();
    @Override
    public String toString() {
        return "Площадь: " + calculateArea() + ", Периметр: " + calculatePerimeter();
    }
}
// Подклассы
class Circle2 extends Shape2 {
    private double radius;
    public Circle2(double radius) {
        this.radius = radius;
    }
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
    @Override
    public String toString() {
        return "Круг (Площадь: " + String.format("%.2f", calculateArea()) +
                ", Периметр: " + String.format("%.2f", calculatePerimeter()) + ")";
    }
}
class Square2 extends Shape2 {
    private double sideLength;
    public Square2(double sideLength) {
        this.sideLength = sideLength;
    }
    @Override
    double calculateArea() {
        return sideLength * sideLength;
    }
    @Override
    double calculatePerimeter() {
        return 4 * sideLength;
    }
    @Override
    public String toString() {
        return "Квадрат (" + super.toString() + ")";
    }
}
class Rectangle2 extends Shape2 {
    private double width;
    private double height;

    public Rectangle2(double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    double calculateArea() {
        return width * height;
    }
    @Override
    double calculatePerimeter() {
        return 2 * (width + height);
    }
    @Override
    public String toString() {
        return "Прямоугольник (" + super.toString() + ")";
    }
}
class Triangle2 extends Shape2 {
    private double a;
    private double b;
    private double c;

    public Triangle2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    double calculateArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c)); // Формула Герона
    }
    @Override
    double calculatePerimeter() {
        return a + b + c;
    }
    @Override
    public String toString() {
        return "Треугольник (" + super.toString() + ")";
    }
}

public class Example8 {
    public static void main(String[] args) {
        Animal dog = new Dog("Злата", 7, "Шпицц");
        Animal cat = new Cat("Моня", 5, true);
        Animal bird = new Bird("Стеша", 1, true);

        System.out.printf(dog + ", ");
        dog.makeSound();
        System.out.printf(cat + ", ");
        cat.makeSound();
        System.out.printf(bird + ", ");
        bird.makeSound();

        System.out.println();

        Shape2 circle = new Circle2(5.0);
        Shape2 square = new Square2(4.0);
        Shape2 rectangle = new Rectangle2(3.0, 6.0);
        Shape2 triangle = new Triangle2(3.0, 4.0, 5.0);

        System.out.println(circle);
        System.out.println(square);
        System.out.println(rectangle);
        System.out.println(triangle);

    }
}

