class Pattern_12 {
    public static void main(String args[]) {
        for (int i = 1; i <= 5; i++) {
            int current = i;
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print(current + " ");
            }
            System.out.println();
        }
    }
}
