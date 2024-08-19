import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        System.out.println("Введите размер вклада");
        Scanner scanner = new Scanner(System.in);
        int vklad = scanner.nextInt();
        double stavka = 0.06;
        double sum1 = (vklad*stavka)+vklad;

        double sum2 = (sum1*stavka)+sum1;
        System.out.print("Размер вклада через 2 года = ");
        System.out.println(sum2);


    }
}
