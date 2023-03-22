class Hollow_Inverted_Half_Pyramid {
    public static void main(String[] args) {

        for (int i = 6; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                if (j == i || j == 1 || i == 6) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
