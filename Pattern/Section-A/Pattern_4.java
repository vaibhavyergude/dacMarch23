class Pattern_4 {
    public static void main(String args[]) {
        for (int i = 1; i < 6; i++) {
            int temp = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(temp + " ");
            }
            System.out.println();
        }
    }
}
