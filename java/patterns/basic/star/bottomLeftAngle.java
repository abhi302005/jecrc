public class bottomLeftAngle {
    public static void main(String[] args) {
        for (int row = 1; row <= 5; row++) {
            // for blank space
            for (int space = 1; space <= row - 1; space++) {
                System.out.print(" ");

            }
            // to print star
            for (int star = 1; star <= 6 - row; star++) {
                System.out.print("*");

            }
            System.out.print("\n");
            

        }
    }
}
