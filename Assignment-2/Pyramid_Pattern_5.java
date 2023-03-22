class Pyramid_Pattern_5 {
    public static void main(String[] args) {
        int n = 9;
        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j >= 1; j--) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(n - j + 1 + " ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(n - j + 1 + " ");
            }
            System.out.println();
        }
    }
}
