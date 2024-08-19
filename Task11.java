import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество секунд до Нового года");
        int time = scanner.nextInt();
        int day = time/86400;
        int hours = (time - (day*86400))/3600;
        int min = (time- (day*86400) - (hours*3600))/60;
        int sec = time - (day*86400 )- (hours*3600) - (min*60);
        System.out.println("До Нового года осталось");
        System.out.println(day + " Дней " + hours + " Часов " + min + " Минут " + sec + " Секунд ");

    }
}
