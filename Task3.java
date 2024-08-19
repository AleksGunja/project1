import javax.xml.transform.Source;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите трехзначное число");
        int n = scanner.nextInt();
        int a = n%10;
        int b = (n/10)%10;
        int c = (n/100)%10;
        int sum = a+b+c;
        System.out.print("Сумма чисел введенного числа = ");
        System.out.println(sum);

    }
}
