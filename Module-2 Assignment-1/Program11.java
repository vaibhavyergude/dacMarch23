import java.util.Scanner;

class Program11 {
    public static void main(String[] args) {
        /*
         * Accept character from command line and perform below
         * operations. Here you can use charAt() method to extract
         * character:
         * a. Check whether entered character is letter or digit. If it
         * is digit then print its values as well as code point.
         * b. If it is character then check whether it is in lowercase?
         * If it is in lowercase then convert it into upper case and
         * print it well as its code point. If it is in uppercase
         * Core Java Assignment 1 then convert it into lower case and print it well as
         * its
         * code point.
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Input:");
        char input = sc.next().charAt(0);

        // char array
        char arr[] = { input };

        // Method 1
        // int codePoint = input;

        // method 2
        int codePoint = Character.codePointAt(arr, 0);

        if (Character.isDigit(input)) {
            System.out.println("Value: " + input);
            System.out.println("Code point: " + codePoint);
        } else if (Character.isLowerCase(input)) {
            char upper = Character.toUpperCase(input);
            char arr1[] = { upper };
            int codePoint1 = Character.codePointAt(arr1, 0);
            System.out.println("Upper Case: " + upper);
            System.out.println("Code point: " + codePoint1);
        } else if (Character.isUpperCase(input)) {
            char lower = Character.toLowerCase(input);
            char arr2[] = { lower };
            int codePoint2 = Character.codePointAt(arr2, 0);

            System.out.println("Lower Case: " + lower);
            System.out.println("CodePoint: " + codePoint2);
        } else {
            System.out.println("Invalid input");
        }

        sc.close();
    }
}
