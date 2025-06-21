package lr2;

import java.util.Scanner;

class Person {
    // Поля класса
    private String name;
    private int age;
    private String gender;
    // Конструктор с параметрами
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    // Геттеры и сеттеры для полей
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    // Метод для вывода информации о человеке
    public void displayInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Пол: " + gender);
    }
}

public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = in.nextLine();
        System.out.print("Введите возраст: ");
        int age = in.nextInt();
        in.nextLine();
        System.out.print("Введите пол: ");
        String gender = in.nextLine();
        Person person = new Person(name, age, gender);
        person.displayInfo();
        System.out.print("Введите новое имя: ");
        String newName = in.nextLine();
        person.setName(newName);
        System.out.print("Введите новый возраст: ");
        int newAge = in.nextInt();
        in.nextLine();
        person.setAge(newAge);
        System.out.print("Введите новый пол: ");
        String newGender = in.nextLine();
        person.setGender(newGender);
        person.displayInfo();
        in.close();
    }
}

