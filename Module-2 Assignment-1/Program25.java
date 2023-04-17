class Program25 {
    public static void main(String[] args) {

        /*
         * Write a program to convert state of Float instance into byte,
         * short, int, long, float and double.
         */

        Float F = new Float(789456);
        System.out.println("Float = " + F);

        byte b = F.byteValue();
        System.out.println("Byte = " + b);

        short s = F.shortValue();
        System.out.println("Short = " + s);

        int i = F.intValue();
        System.out.println("Int = " + i);

        long l = F.longValue();
        System.out.println("Long = " + l);

        float f = F.floatValue();
        System.out.println("Float = " + f);

        double d = F.doubleValue();
        System.out.println("Double = " + d);

    }
}