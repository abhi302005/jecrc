import java.util.Scanner;

public class bubbleSort {
    public static void main(String[] args) {
        int n;
        System.out.print("ENTER THE SIZE-->");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.print("ENTER THE ELEMEMTS IN THE ARRAY-->");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("THE UNSORTED ARRAY IS-->");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print("\nTHE SORTED ARRAY USING BUBBLEsort IS-->");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {

                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        // 5System.out.print("\n");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
