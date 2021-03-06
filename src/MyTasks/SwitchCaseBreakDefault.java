package MyTasks;

import java.util.Scanner;

public class SwitchCaseBreakDefault {

    public static void main(String[] args) {
        System.out.println("Калькулятор");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        double a, b;
        switch (s) {
            case "ділення":
                a = scanner.nextInt();
                b = scanner.nextInt();
                System.out.println(a / b);
                break;
            case "множення":
                a = scanner.nextInt();
                b = scanner.nextInt();
                System.out.println(a * b);
                break;
            case "сума":
                a = scanner.nextInt();
                b = scanner.nextInt();
                System.out.println(a + b);
                break;
            case "різниця":
                a = scanner.nextInt();
                b = scanner.nextInt();
                System.out.println(a - b);
                break;
            case "остача від ділення":
                a = scanner.nextInt();
                b = scanner.nextInt();
                System.out.println(a % b);
                break;
            case "відсоток від числа":
                a = scanner.nextInt();
                b = scanner.nextInt();
                System.out.println(a * b / 100);
                break;
            case "квадрат числа":
                a = scanner.nextInt();
                System.out.println(a * a);
                break;
            case "корінь числа":
                a = scanner.nextInt();
                System.out.println(Math.sqrt(a));
                break;
            default:
                System.out.println("Невірно введена операція!");
                break;
        }

    }
}
