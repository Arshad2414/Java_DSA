import java.util.Scanner;

public class Total_Number_of_days_in_months_by_user_given_number_of_month_11 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        int month;
        System.out.println("Enter month in number (1/12)");
        month = sc.nextInt();
        switch (month) {
            case 1:
                System.out.println("January (31 days) ");
                break;
            case 2:
                System.out.println("Febuary (28 or 29 days) ");

                break;
            case 3:
                System.out.println("March (31 days) ");

                break;
            case 4:
                System.out.println("April (30 days) ");

                break;
            case 5:
                System.out.println("May (31 days) ");

                break;
            case 6:
                System.out.println("Jun (30 days) ");

                break;
            case 7:
                System.out.println("July (31 days) ");

                break;
            case 8:
                System.out.println("August (31 days) ");

                break;
            case 9:
                System.out.println("Septemper (30 days) ");

                break;
            case 10:
                System.out.println("Octobar (31 days) ");

                break;
            case 11:
                System.out.println("Novembar (30 days) ");

                break;
            case 12:
                System.out.println("December (31 days) ");

                break;
            default:
                System.out.println("Wrong Entry ");
                break;
        }
    }
}
