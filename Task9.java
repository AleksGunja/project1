import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        if (a%1 == 0 )
        {
            System.out.println("Число не имеет вещественной части");
        }
            else {
                System.out.println("Число имеет вещественную часть");
            }
        }
    }

