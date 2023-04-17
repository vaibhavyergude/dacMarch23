class Program22 {
    public static void main(String[] args) {
        Long num1 = new Long(123);
        Long num2 = new Long(111);
        
        // finding minimum and maximum number
        Long min = Long.min(num1, num2);
        Long max = Long.max(num1, num2);
        
        System.out.println("Minimum number: " + min);
        System.out.println("Maximum number: " + max);
        
        // adding two long numbers
        Long sum = Long.sum(num1, num2);
        
        System.out.println("Sum of two numbers: " + sum);
    }
}
