public class leftAngle {
    public static void main(String[] args) {
        for (int row = 1; row <= 5; row++) {
            // for blank space
            for (int space = 1; space <=6- row; space++) {
                System.out.print(" ");

            }
            // to print 1
            for (int number = 1; number <= row; number++) {
                System.out.print("1");
                
            }
            
            System.out.print("\n");
            
        }
    }
}
