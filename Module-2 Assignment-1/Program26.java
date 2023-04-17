class Program26 {
    public static void main(String[] args) {
        /*
         * Write a program to find minimum and maximum number as well as
         * to add two float numbers using methods of Float.
         */

        float num1 = 3.5f;
        float num2 = 2.7f;

        float minNum = Float.min(num1, num2);
        float maxNum = Float.max(num1, num2);

        float sum = Float.sum(num1, num2);

        System.out.println("Minimum number: " + minNum);
        System.out.println("Maximum number: " + maxNum);
        System.out.println("Sum of two numbers: " + sum);
    }
}
