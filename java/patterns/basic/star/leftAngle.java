public class leftAngle {
    public static void main(String[] args) {
        for (int row = 1; row <= 5; row++) {
            // for blankSpace
            for (int space = 1; space <= 5 - row; space++) {
                System.out.print(" ");

            }
            // to print star
            for (int star = 1; star <= row; star++) {
                System.out.print("*");

            }
            System.out.println();
            
        }
    }
}
