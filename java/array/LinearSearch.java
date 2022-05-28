import java.util.Scanner;

public class LinearSearch {
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
        int item, f = 0;
        System.out.print("ENTER THE ITEM TO SEARCH-->");
        item = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (a[i] == item) {
                System.out.print("ELEMENT FOUND AT POSITION-->" + i);
                System.out.println("\n" + item);
                f = 1;
                break;
            }
        }
        if (f == 0) {
            System.out.print("INVALID ENTRY OF DATA");
        }
    }

}
