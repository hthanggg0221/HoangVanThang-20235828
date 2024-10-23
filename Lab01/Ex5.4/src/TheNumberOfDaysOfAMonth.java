import java.util.Scanner;
public class TheNumberOfDaysOfAMonth {
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a year (e.g. 1999): ");
            String strYear = keyboard.nextLine().trim();

            int year;
            try {
                year = Integer.parseInt(strYear);
                if (year < 0){
                    System.out.println("Invalid input of year format. Please enter a valid year (e.g., 1999). Try again!");
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input of year format. Please enter a valid year(e.g. 1999). Try again!");
                continue;
            }

            System.out.print("Enter a month (e.g. January, Jan., Jan, and 1): ");
            String strMonth = keyboard.nextLine().trim();

            int month = switchMonthNumber(strMonth);
            if (month == -1) {
                System.out.println("Invalit month input. Please enter a valid month (e.g. January, Jan., Jan, and 1). Try again!");
                continue;
            }

            int days = daysOfMonth(month, year);
            System.out.println("The number of days of a month: " + days);
            break;
        }

        keyboard.close();
    }
    public static int switchMonthNumber(String strMonth){
        switch(strMonth.toLowerCase()) {
            case "january":
            case "jan.":
            case "jan":
            case "1":
                return 1;

            case "february":
            case "feb.":
            case "feb":
            case "2":
                return 2;

            case "march":
            case "mar.":
            case "mar":
            case "3":
                return 3;

            case "april":
            case "apr.":
            case "apr":
            case "4":
                return 4;

            case "may":
            case "5":
                return 5;

            case "june":
            case "jun":
            case "6":
                return 6;

            case "july":
            case "jul":
            case "7":
                return 7;

            case "august":
            case "aug.":
            case "aug":
                return 8;

            case "september":
            case "sept.":
            case "sep":
            case "9":
                return 9;

            case "october":
            case "oct.":
            case "oct":
            case "10":
                return 10;

            case "november":
            case "nov.":
            case "nov":
            case "11":
                return 11;

            case "december":
            case "dec.":
            case "dec":
            case "12":
                return 12;

            default:
                return -1;
        }
    }
    public static int daysOfMonth(int month, int year){
        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;

            case 4:
            case 6:
            case 9:
            case 11:
                return 30;

            case 2:
                return (isLeapYear(year) == 1) ? 29 : 28;

            default:
                return -1;

        }
    }
    public static int isLeapYear(int year){
        int check = 0;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            check = 1;
        }
        return check;
    }
}
