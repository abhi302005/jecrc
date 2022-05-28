import java.util.Scanner;

public class selectionSort {
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
        System.out.print("\nTHE SORTED ARRAY USING SELECTIONsort IS-->");
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {

                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        // 5System.out.print("\n");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
