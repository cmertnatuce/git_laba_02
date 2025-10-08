import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Простой калькулятор");
        System.out.println("===================");

        // Ввод первого числа
        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();

        // Ввод второго числа
        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();

        // Выбор операции
        System.out.println("\nВыберите операцию:");
        System.out.println("1 - Сложение (+)");
        System.out.println("2 - Вычитание (-)");
        System.out.print("Ваш выбор: ");

        int choice = scanner.nextInt();
        double result = 0;

        // Выполнение выбранной операции
        switch (choice) {
            case 1:
                result = add(num1, num2);
                break;
            case 2:
                result = subtract(num1, num2);
                break;
            default:
                System.out.println("Неверный выбор операции!");
                return;
        }

        // Вывод результата
        System.out.println("\nРезультат: " + result);

        scanner.close();
    }

    // Операция сложения
    public static double add(double a, double b) {
        return a + b;
    }

    // Операция вычитания
    public static double subtract(double a, double b) {
        return a - b;
    }
}