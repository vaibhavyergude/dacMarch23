public class Program9 {
    public static void main(String[] args) {

        Byte B = 120;

        // Write a program to convert state of Byte instance into byte,
        // short, int. long, float and double.
        byte b = B.byteValue();
        System.out.println("byte = "+b);

        short sh = B.shortValue();
        System.out.println("short = "+sh);

        int i = B.intValue();
        System.out.println("int = "+i);

        long l = B.longValue();
        System.out.println("long = "+l);

        float f = B.floatValue();
        System.out.println("float = "+f);

        double d = B.doubleValue();
        System.out.println("double = "+d);
    }
}
