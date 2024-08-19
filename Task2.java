import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое натуральное число");
        int a = scanner.nextInt();
        System.out.println("Введите второе натуральное число");
        int b = scanner.nextInt();
        int del = a/b;
        System.out.print("Резултат деления = ");
        System.out.println(del);
        int ost = a%b;
        System.out.print("Остаток от деления = ");
        System.out.println(ost);
        double corn = sqrt(a);
        System.out.print("Квадратный корень из первого числа = ");
        System.out.println(corn);
    }
}
