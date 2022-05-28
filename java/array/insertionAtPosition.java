import java.util.Scanner;

public class insertionAtPosition {
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
        System.out.println("enter the element you want to insert");
        int item = sc.nextInt();
        if (pos < size) {

            for (int i = pos; i < size - 1; i++) {
                arr[i + 1] = arr[i];
            }
            arr[pos] = item;
        }
        if (pos == size) {
            size++;
            arr[size + 1] = arr[size];
            arr[pos] = item;
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
