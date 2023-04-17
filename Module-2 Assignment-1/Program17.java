class Program17 {
    public static void main(String[] args) {
        // Write a program to convert state of Integer instance into
        // byte, short, int, long, float and double.

        Integer I = new Integer(112);

        byte b = I.byteValue();
        System.out.println("byte = "+b);

        short s = I.shortValue();
        System.out.println("short = "+s);

        int i = I.intValue();
        System.out.println("int = "+i);

        float f = I.floatValue();
        System.out.println("float = "+f);

        double d = I.doubleValue();
        System.out.println("double = "+d);
    }
}
