class Program28 {
    public static void main(String[] args) {
        /*
         * Write a program to convert:
         * a. double value into String
         * b. double value into Double instance.
         * c. String instance into Double instance.
         * d. double value into binary, octal and hexadecimal
         * string(Note: Here you can use doubleToLongBits() method
         * along with methods of Long class).
         */

        double num = 3.14159;
        // convert double value to String
        String str = Double.toString(num);
        System.out.println("Double value as String: " + str);

        // convert double value to Double instance
        Double numObj = Double.valueOf(num);
        System.out.println("Double value as Double object: " + numObj);

        // convert String instance to Double instance
        String strNum = "2.71828";
        Double numObj2 = Double.valueOf(strNum);
        System.out.println("String value as Double object: " + numObj2);

        // convert double value to binary, octal, and hexadecimal string
        long bits = Double.doubleToLongBits(num);
        String binaryStr = Long.toBinaryString(bits);
        System.out.println("Double value as binary string: " + binaryStr);

        String octalStr = Long.toOctalString(bits);
        System.out.println("Double value as octal string: " + octalStr);

        String hexStr = Long.toHexString(bits);
        System.out.println("Double value as hexadecimal string: " + hexStr);
    }
}
