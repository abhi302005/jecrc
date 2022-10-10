public class pattern {
    public static void main(String[] args) {
        pattern12(5);
    }

    static void pattern13(int n){
        for(int row  = 1; row<= n; row++){
            for(int o_space = n-row ; o_space>=1; o_space--){
                System.out.print(" ");
            }
            for(int col = )
        }
    }

    static void pattern12(int n) {
        for (int row = 1; row < 2 * n + 1; row++) {
            // System.out.println(tc);
            if (row < n + 1) {
                int tc = (n) - row + 1;
                int space = n - tc;
                for (int s = 1; s <= space; s++) {
                    System.out.print(" ");
                }
                for (int col = tc; col >= 1; col--) {
                    System.out.print("* ");

                }
            } else {
                // tc = row - n;
                for (int s = n; s > row - n; s--) {
                    System.out.print(" ");
                }
                for (int col = 1; col <= row - n; col++) {
                    System.out.print("* ");

                }
            }
            System.out.println();
        }
    }

    static void pattern8(int n) {
        for (int row = 1; row <= n; row++) {
            int tc = row < n ? row : (n) - row;
            int space = n - tc;
            for (int s = 1; s <= space; s++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= tc; col++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }

    static void pattern28(int n) {
        for (int row = 1; row < 2 * n; row++) {
            int tc = row < n ? row : (2 * n) - row;
            int space = n - tc;
            for (int s = 1; s <= space; s++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= tc; col++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }

    static void pattern5(int n) {
        for (int row = 1; row < 2 * n; row++) {
            int tc;
            if (row < n) {
                tc = row;
            } else {
                tc = (2 * n) - row;
            }
            for (int col = 1; col <= tc; col++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        // no of rows
        for (int row = 1; row <= n; row++) {
            // no of col
            // n-1
            for (int col = n; col >= row; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
