package lr2;

import java.util.Scanner;

// Интерфейс банковского счета
interface BankAccount {
    void deposit(double amount);
    boolean withdraw(double amount);
    double getBalance(); // Метод для просмотра баланса
}
class SimpleBankAccount implements BankAccount {
    private double balance;
    public SimpleBankAccount(double initialBalance) {
        this.balance = initialBalance;
    }
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("Успешно пополнили на %.2f руб.\nНовый баланс: %.2f руб.%n", amount, balance);
        } else {
            System.err.println("Ошибка: Сумма пополнения должна быть положительной!");
        }
    }
    @Override
    public boolean withdraw(double amount) {
        if (balance >= amount && amount > 0) {
            balance -= amount;
            System.out.printf("Успешно сняли %.2f руб.\nНовый баланс: %.2f руб.%n", amount, balance);
            return true;
        } else {
            System.err.println("Ошибка: Недостаточно средств или некорректная сумма!");
            return false;
        }
    }
    @Override
    public double getBalance() {
        return balance;
    }
}

public class Example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите начальную сумму на вашем счете: ");
        double initialAmount = in.nextDouble();
        BankAccount account = new SimpleBankAccount(initialAmount);
        while (true) {
            System.out.println("\nВыберите операцию:");
            System.out.println("1. Пополнить счет");
            System.out.println("2. Снять средства");
            System.out.println("3. Просмотреть баланс");
            System.out.println("4. Выход");
            int choice = in.nextInt();
            switch(choice) {
                case 1:
                    System.out.print("Введите сумму для пополнения: ");
                    double depositAmount = in.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Введите сумму для снятия: ");
                    double withdrawalAmount = in.nextDouble();
                    account.withdraw(withdrawalAmount);
                    break;
                case 3:
                    System.out.printf("Ваш текущий баланс: %.2f руб.%n", account.getBalance());
                    break;
                case 4:
                   System.exit(0); // Выходим из программы
                    break;
                default:
                    System.out.println("Некорректный выбор. Повторите попытку.");
            }
        }
    }
}


