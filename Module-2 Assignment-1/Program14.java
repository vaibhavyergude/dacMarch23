class Program14 {
    public static void main(String[] args) {
        // Write a program to convert state of Short instance into byte,
        // short, int, long, float and double.

        Short s = new Short("20");

        // Short instance to byte
        System.out.println("Short to byte:- " + s.byteValue());

        // Short instance to short
        System.out.println("Short to short:- " + s.shortValue());

        // Short instance to int
        System.out.println("Short to int:- " + s.intValue());

        // Short instance to long
        System.out.println("Short to long:- " + s.longValue());

        // Short instance to float
        System.out.println("Short to float:- " + s.floatValue());

        // Short instance to double
        System.out.println("Short to double:- " + s.floatValue());
    }
}
