class Program13 {
    public static void main(String[] args) {
        short a = 5;

        // short to string
        String s = Short.toString(a);
        System.out.println("String:- " + s);

        // short value into Short instance
        Short S1 = Short.valueOf(a);
        System.out.println("Short instance:- " + S1);

        // String instance into Short instance
        String S2 = new String("1");
        Short s2 = Short.valueOf(S2);
        System.out.println("String to Short:- " + s2);
    }
}
