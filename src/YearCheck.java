public class YearCheck {

    boolean isLeap(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        }
        return false;
    }

    void checkDay(int day) {
        switch (day) {
            case 1:
                System.out.println("Podany dzien tygodnia: " + day);
                System.out.println("poniedziałek to dzien pracujacy");
                break;
            case 2:
                System.out.println("Podany dzien tygodnia: " + day);
                System.out.println("wtorek to dzien pracujacy");
                break;
            case 3:
                System.out.println("Podany dzien tygodnia: " + day);
                System.out.println("sroda to dzien pracujacy");
                break;
            case 4:
                System.out.println("Podany dzien tygodnia: " + day);
                System.out.println("czwartek to dzien pracujacy");
                break;
            case 5:
                System.out.println("Podany dzien tygodnia: " + day);
                System.out.println("piatek to dzien pracujacy");
                break;
            case 6:
                System.out.println("sobota dzien tygodnia: " + day);
                System.out.println("poniedziałek to dzien wolny");
                break;
            case 7:
                System.out.println("Podany dzien tygodnia: " + day);
                System.out.println("niedziela to dzien wolny");
                break;
            default:
                System.out.println("Niepoprawny dzien");
        }
    }

    void ifology(int number) {
        switch (number % 2) {
            case (0):
                System.out.println("Liczba " + number + " jest parzysta");
                break;
            case (1):
                System.out.println("Liczba " + number + " jest nieparzysta");
                break;
            case (-1):
                System.out.println("Liczba " + number + " jest ujemna i nieparzysta");
                break;
        }
    }
}
