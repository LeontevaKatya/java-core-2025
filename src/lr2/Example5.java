package lr2;

import java.util.Scanner;

class Rectangle {
    // Поля класса
    private double length;
    private double width;
    // Конструктор с параметрами
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    // Геттеры и сеттеры для полей
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    // Методы
    public double calculateArea() {
        return length * width;
    }
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
    // Метод для вывода информации о прямоугольнике
    public void displayInfo() {
        System.out.println("Длина: " + length);
        System.out.println("Ширина: " + width);
        System.out.println("Площадь: " + calculateArea());
        System.out.println("Периметр: " + calculatePerimeter());
    }
}

public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите длину прямоугольника: ");
        double length = in.nextDouble();
        in.nextLine();
        System.out.print("Введите ширину прямоугольника: ");
        double width = in.nextDouble();
        in.nextLine();
        Rectangle rectangle = new Rectangle(length, width);
        rectangle.displayInfo();
        System.out.print("Введите новую длину: ");
        double newLength = in.nextDouble();
        in.nextLine();
        rectangle.setLength(newLength);
        System.out.print("Введите новую ширину: ");
        double newWidth = in.nextDouble();
        in.nextLine();
        rectangle.setWidth(newWidth);
        rectangle.displayInfo();
        in.close();
    }
}
