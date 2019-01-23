import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        YearCheck yc = new YearCheck();
        MonthConverter mc = new MonthConverter();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj rok, który chcesz sprawdzić: ");
        int year = scanner.nextInt();
        System.out.println(yc.isLeap(year));

        System.out.println("Podaj dzien, który chcesz sprawdzić: ");
        int day = scanner.nextInt();
        yc.checkDay(day);

        System.out.println("Podaj liczbę do sprawdzenia");
        int number = scanner.nextInt();
        yc.ifology(number);
        System.out.println("Podaj liczbę: ");
        int month = scanner.nextInt();
        System.out.println(mc.convert(month));
    }
}
