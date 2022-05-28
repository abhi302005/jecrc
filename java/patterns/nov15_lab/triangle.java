/* 
/**
 * triangle
 */
// import java.util.*;
/* 
public class triangle {

    public static void main(String[] args) {
        // Scanner inp = new Scanner(System.in);
        // int len = inp.nextInt();
        int len = 13;
        for (int i = 1; i <= len; i++) {
            for (int j = len; j > i; j--) {
                System.out.print(" ");
                // System.out.print(" ");

            }
            for (int spc = len; spc <= i; spc++) {
                System.out.print("*");
                // System.out.print("*");

            }
            for (int k = 2; k <= i; k++) {
                System.out.print("*");
                // System.out.print("*");

            }
            System.out.print("\n");

        }

        for (int i = 1; i <= len; i++) {
            for (int b = 1; b <= i; b++) {
                System.out.print("*");
            }
            for (int s = len - 1; s >= i; s--) {
                System.out.print(" ");
            }
            for (int k = len; k > i; k--) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
} */

//JAVA Code to print

// the diamond shape
// import java.util.*;

class triangle {

    // Prints diamond pattern
    // with 2n rows
    static void printDiamond(int n) {
        int space = n - 1;

        // run loop (parent loop)
        // till number of rows
        for (int i = 0; i < n; i++) {
            // loop for initially space,
            // before star printing
            for (int j = 0; j < space; j++)
                System.out.print(" ");

            // Print i+1 stars
            for (int j = 0; j <= i; j++)
                System.out.print("* ");

            System.out.print("\n");
            space--;
        }

        // Repeat again in
        // reverse order
        space = 0;

        // run loop (parent loop)
        // till number of rows
        for (int i = n; i > 0; i--) {
            // loop for initially space,
            // before star printing
            for (int j = 0; j < space; j++)
                System.out.print(" ");

            // Print i stars
            for (int j = 0; j < i; j++)
                System.out.print("* ");

            System.out.print("\n");
            space++;
        }
    }

    // Driver Code
    public static void main(String[] args) {
        printDiamond(5);

    }
}

// This code is contributed
// by Arnav Kr. Mandal.
