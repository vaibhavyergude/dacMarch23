class Pattern_5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            // Spaces
            for (int j = 5 - i; j >= 1; j--) {
                System.out.print(" ");
            }
            // Stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            // new line
            System.out.println();
        }
    }
}
