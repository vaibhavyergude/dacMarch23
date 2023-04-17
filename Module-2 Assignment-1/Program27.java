class Program27 {
    public static void main(String[] args) {
        // number of bits used to represent a double value
        int bits = Double.SIZE;
        System.out.println("Number of bits used to represent a double value: " + bits);

        // number of bytes used to represent a double value
        int bytes = Double.BYTES;
        System.out.println("Number of bytes used to represent a double value: " + bytes);

        // minimum value a double
        double min = Double.MIN_VALUE;
        System.out.println("Minimum value a double can have: " + min);

        // maximum value a double
        double max = Double.MAX_VALUE;
        System.out.println("Maximum value a double can have: " + max);
    }
}
