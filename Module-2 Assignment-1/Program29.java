class Program29 {
    public static void main(String[] args) {
        /*
         * Write a program to convert state of Double instance into byte,
         * short, int, long, float and double.
         */

        Double d = 123.45;

        byte b = d.byteValue();
        short s = d.shortValue();
        int i = d.intValue();
        long l = d.longValue();
        float f = d.floatValue();
        double db = d.doubleValue();

        System.out.println("Original Double: " + d);
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("Converted double: " + db);
    }
}
