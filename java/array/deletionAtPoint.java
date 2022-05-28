import java.util.Scanner;

public class deletionAtPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of element");
        int size = sc.nextInt();
        int arr[] = new int[size];
        // inserting the element's into array
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the position\n");
        int pos = sc.nextInt();
        if (pos > size || pos < 0)
            return;
        // System.out.println("enter the element you want to insert");
        // int item = sc.nextInt();
        if (pos < size) {
            int item = arr[pos];
            System.out.println("=>" + item);

            for (int i = pos; i < size - 1; i++) {
                arr[i] = arr[i + 1];
            }
            // arr[pos] = item;
            size--;
        }
        if (pos == size) {
            int item = arr[pos];
            System.out.println("delete-item=>" + item + "\n");
            size--;
            // arr[size + 1] = arr[size];
            // arr[pos] = item;
        }
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);

        }
    }
}
