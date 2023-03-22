class Inverted_Pyramid_Pattern_6 {
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 9 - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }    
}
