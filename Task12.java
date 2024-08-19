import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int pie = n * 2;
        double milk1 = n * 0.2;
        double pack = milk1 / 0.9;
        if (pack % 1 != 0) {
            pack = pack + 1;
        }
        int pack1 = (int) pack;
        System.out.println("Если в школе 100% учеников весом меньше 30 кг то необходимо " + pie + " пирожков");
        System.out.println("Если в школе 100% учеников весом меньше 30 кг то необходимо " + pack1 + " пакетов молока");
        double students60 = n * 0.6;
        students60 = Math.ceil(students60);
        double students30 = n - students60;
        double pie2 = students30 + (students60 * 2);
        int pie3 = (int) pie2;
        System.out.println("Если в школе 60% учеников с весом меньше 30 кг то понадобидтся " + pie3 + " пирожков");
        double milk2 = (students60 * 0.2) / 0.9;
        {
            if (milk2 % 1 != 0) {
                milk2 = milk2 + 1;
            }
            int milk3 = (int) milk2;
            System.out.println("Если в школе 60% учеников с весом меньше 30 кг то понадобидтся " + milk3 + " пакетов молока");
        }
        {
            double students1 = n / 100;
            if (students1 <= 0) {
                {
                    students1 = students1 + 1;
                    //(students1%1 != 0)
                    // students1 = students1 + 1;}

                }
                int students2 = (int) students1;
                int students99 = n - students2;

                int pie4 = students2 * 2;
                int pie5 = students99;
                int sumpie = pie4 + pie5;
                System.out.println("Если в школе 1% учеников имеют вес меьше 30 кг то понадопится " + sumpie + " пирожков");
            }
        }
    }
}
