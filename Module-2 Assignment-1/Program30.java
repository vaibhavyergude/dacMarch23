class Program30 {
    public static void main(String[] args) {
        /*
         * Write a program to find minimum and maximum number as well as
         * to add two double numbers using methods of Double.
         */

        double a = 3.14;
        double b = 4.7;

        double min = Double.min(a, b);
        double max = Double.max(a, b);
        double sum = Double.sum(a, b);

        System.out.println("Minimum = " + min);
        System.out.println("Maximum = " + max);
        System.out.println("Sum = " + sum);
    }
}
