public class abhay {
    public static void main(String[] args) {
        for (int row = 1; row <= 5; row++) {
            int col;
            for (int k = 5 - row; k > 0; k--) {
                System.out.print(" ");
                
            }
            for (col = 1; col <= row; col++) {
                System.out.print(col);
                System.out.print(" ");
                // if (row == col-1)
                //     break;

            }
            if (col > row){
                 col-=2;
            // System.out.print('\n');
            
            // if (row == col-1) {
                // System.out.print(col);
                // System.out.print("in loop");
                for (; col >= 1; col--) {
                    System.out.print(col);
                    System.out.print(" ");
                    
                }
            }
            
            System.out.println();
            
        }
    }
}
