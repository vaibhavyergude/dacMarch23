class Pattern_15 {
    public static void main(String args[]) {
        for (int i = 0; i < 5; i++) {
            int num = 5;
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(num + " ");
                num--;
            }
            System.out.println();
        }
    }
}
