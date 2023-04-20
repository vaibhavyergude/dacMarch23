import java.util.Scanner;
import java.text.SimpleDateFormat;

class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking Date from user
        System.out.println("Enter Day: ");
        int day = sc.nextInt();
        System.out.println("Enter Month: ");
        int month = sc.nextInt();
        System.out.println("Enter Year: ");
        int year = sc.nextInt();

        // Taking Time from user
        System.out.println("Enter Hour: ");
        int hour = sc.nextInt();
        System.out.println("Enter Minute: ");
        int minute = sc.nextInt();
        System.out.println("Enter Second: ");
        int second = sc.nextInt();

        // Changing format of date
        String pattern1 = "dd/mm/yyyy";
        SimpleDateFormat sdf1 = new SimpleDateFormat(pattern1);
        System.out.println(sdf1);

    }
}