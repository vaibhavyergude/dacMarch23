public class Full_Pyramid {
    public static void main(String[] args) {
        for (int i = 1; i < 7; i++) {
            for (int j = 6; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
