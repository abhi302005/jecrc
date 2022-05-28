public class bottomLeftAngle {
    public static void main(String[] args) {
        for (int row = 1; row <= 5; row++) {
            // for blank space
            for (int space = 1; space <= row - 1; space++) {
                System.out.print(" ");

            }
            // to print 1
            for (int number = 1; number <= 6 - row; number++) {
                System.out.print("1");
            }
            System.out.print("\n");
            
        }
    }
}
