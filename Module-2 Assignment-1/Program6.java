class Program6 {
    public static void main(String[] args) {
        // boolean value into String
        boolean b1 = false;
        String s1 = Boolean.toString(b1);
        System.out.println(s1);

        // boolean value into Boolean instance
        boolean b2 = true;
        Boolean B2 = Boolean.valueOf(b2);
        System.out.println(B2);

        // String value into boolean value
        // String s3 = "World"; //This one is also valid
        String s3 = new String("TrUe");
        boolean b3 = Boolean.valueOf(s3);
        System.out.println(b3);

        // String value into Boolean instance
        String s4 = "TruE";
        Boolean B4 = Boolean.valueOf(s4);
        System.out.println(B4);

    }
}