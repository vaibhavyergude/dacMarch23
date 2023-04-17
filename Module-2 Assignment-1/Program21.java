class Program21 {
    public static void main(String[] args) {
        // Write a program to convert state of Long instance into byte,
        // short, int, long, float and double.

        Long value = new Long(456);

        // Convert Long to byte
        byte byteValue = value.byteValue();
        System.out.println("Byte value: " + byteValue);
        
        // Convert Long to short
        short shortValue = value.shortValue();
        System.out.println("Short value: " + shortValue);
        
        // Convert Long to int
        int intValue = value.intValue();
        System.out.println("Int value: " + intValue);
        
        // Convert Long to long
        long longValue = value.longValue();
        System.out.println("Long value: " + longValue);
        
        // Convert Long to float
        float floatValue = value.floatValue();
        System.out.println("Float value: " + floatValue);

        // Convert Long to double
        double doubleValue = value.doubleValue();
        System.out.println("Double value: " + doubleValue);


    }
}
