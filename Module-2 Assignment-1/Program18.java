class Program18 {
    public static void main(String[] args) {
        // Write a program to find minimum and maximum number as well as
        // to add two integer numbers using methods of Integer.
        Integer i1 = new Integer(10);
        Integer i2 = new Integer(25);
        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);

        Integer max = Integer.max(i1, i2);
        System.out.println("Max = " + max);

        Integer min = Integer.min(i1, i2);
        System.out.println("Min = " + min);

        Integer add = Integer.sum(i1,i2 );
        System.out.println("Add = " + add);

    }
}
