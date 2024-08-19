import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scanner.nextInt();
        int a = number%10;
        int b = (number/10)%10;
        int c = (number/100)%10;
        int d =(number/1000)%10;

        int sum = a*b*c*d;


        System.out.println(sum);
    }
}
