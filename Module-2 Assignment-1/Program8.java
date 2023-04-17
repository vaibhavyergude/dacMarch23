class Program8 {
    public static void main(String[] args) {
        //byte value into String
        byte b1 = 120;
        String S1 = Byte.toString(b1);
        System.out.println(S1);

        // byte value into Byte instance.
        byte b2 = 125;
        Byte B2 = Byte.valueOf(b2);
        System.out.println(B2);

        //String instance into Byte instance
        String s = new String("6");
        Byte B3 = Byte.parseByte(s);
        System.out.println(B3);
    }
}
