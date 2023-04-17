public class Program16 {
    public static void main(String[] args) {
        // Write a program to convert:
        // a. int value into String
        // b. int value into Integer instance.
        // c. String instance into Integer instance.
        // d. int value into binary, octal and hexadecimal string.
        int i = 123;

        //int to String
        String s1 = Integer.toString(i);
        System.out.println(s1);

        //int value into Integer instance
        Integer I1 = Integer.valueOf(i);
        System.out.println(I1);

        //String instance into Integer instance
        String s2 = "123";
        Integer I2 = Integer.valueOf(s2);
        System.out.println(I2);

        //int value into binary,octal and hexadecimal string
        String binary = Integer.toBinaryString(i);
        System.out.println("Binary:- "+binary);

        String octal = Integer.toOctalString(i);
        System.out.println("Octal:- "+ octal);

        String hex = Integer.toHexString(i);
        System.out.println("Hex:- "+hex);
    }
}
