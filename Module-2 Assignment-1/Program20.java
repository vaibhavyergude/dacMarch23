class Program20 {
    public static void main(String[] args) {
        /*
         * Write a program to convert:
         * a. long value into String
         * b. long value into Long instance.
         * c. String instance into Long instance.
         * d. long value into binary, octal and hexadecimal string.
         */

        long l1 = 123456789;

        // long value into String
        String s = Long.toString(l1);
        System.out.println("String value = " + s);

        // long value into Long instance
        Long l2 = Long.valueOf(l1);
        System.out.println("Long value = " + l2);

        // String instance into Long instance
        String s2 = new String("987");
        Long l3 = Long.parseLong(s2);
        System.out.println("String = " + l3);

        // long value into binary, octal and hexadecimal string.

        String binary = Long.toBinaryString(l1);
        System.out.println("Binary String: " + binary);

        String octal = Long.toOctalString(l1);
        System.out.println("Octal String: " + octal);

        String hex = Long.toHexString(l1);
        System.out.println("Hexadecimal String: " + hex);
    }
}
