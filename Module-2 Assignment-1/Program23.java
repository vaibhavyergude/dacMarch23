class Program23 {
    public static void main(String[] args) {
        // number of bits used to represent a float value
      int bits = Float.SIZE;
      System.out.println("Number of bits used to represent a float value: " + bits);

      // number of bytes used to represent a float value
      int bytes = Float.BYTES;
      System.out.println("Number of bytes used to represent a float value: " + bytes);

      // minimum value of a float
      float minValue = Float.MIN_VALUE;
      System.out.println("Minimum value of a float: " + minValue);

      // maximum value of a float
      float maxValue = Float.MAX_VALUE;
      System.out.println("Maximum value of a float: " + maxValue);
    }
}
