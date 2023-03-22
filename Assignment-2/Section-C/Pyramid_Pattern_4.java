class Pyramid_Pattern_4 {
    public static void main(String[] args) {
    
        int rows = 9;
        int i, j, k, space = rows;
        for (i = 1; i <= rows; i++) {
            for (j = 1; j < space; j++) {
                System.out.print("  ");
            }
            space--;
            for (j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            for (k = i - 1; k >= 1; k--) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
