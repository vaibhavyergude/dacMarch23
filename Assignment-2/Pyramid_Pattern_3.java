class Pyramid_Pattern_3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 9; j >= 1; j--) {
                if (j > i) {
                    System.out.print(" ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

    }
}
