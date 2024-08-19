import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваш рост");
        int height = scanner.nextInt();

        System.out.println("Введите ваш вес");
        Scanner scanner1 = new Scanner(System.in);
        int weight = scanner1.nextInt();

        int a = weight - (height - 110);
        int b = (height-110) - weight;
        if (height - 110 == weight) {
            System.out.println("Ваш вес идеален");
        }
           else if ((height - 110) < weight) {
            System.out.print("Вам нужно сбросить ");
            System.out.print(a);
            System.out.println(" кг");
        }

                else if ((height-110) > weight) {
            System.out.print("Вам нужно набрать ");
            System.out.print(b);
            System.out.println(" кг");
            }
        }
    }



