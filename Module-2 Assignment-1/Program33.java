import java.util.Scanner;

class Program33 {
    public static void main(String[] args) {
        /*
         * Pass integer, float and double value from command line. Parse
         * it appropriately and perform arithmetic operations (+,-,*,/)
         * on it. Here you can you switch case.
         */

        Scanner sc = new Scanner(System.in);

        int intValue = Integer.parseInt(args[0]);
        float floatValue = Float.parseFloat(args[1]);
        double doubleValue = Double.parseDouble(args[2]);

        System.out.println("Enter the operation (+,-,*,/):");
        String operation = sc.nextLine();

        switch (operation) {
            case "+":
                System.out.println(intValue + floatValue + doubleValue);
                break;
            case "-":
                System.out.println(intValue - floatValue - doubleValue);
                break;
            case "*":
                System.out.println(intValue * floatValue * doubleValue);
                break;
            case "/":
                System.out.println(intValue / floatValue / doubleValue);
                break;
            default:
                System.out.println("Invalid operation.");
                break;
        }

        sc.close();

    }
}