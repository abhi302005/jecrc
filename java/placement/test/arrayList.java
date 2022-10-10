import java.util.ArrayList;
import java.util.Collections;
// import java.util.Arrays;
// import java.util.Iterator;
public class arrayList{
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();


        // add element
        arr.add(4);
        arr.add(8);
        arr.add(9);
        arr.add(2,10);
        System.out.println(arr.get(2));
        Collections.sort(arr);
        arr.remove(1);
        System.out.println(arr);

        for(int i =0; i< arr.size();i++){
            System.out.println(arr.get(i));
        }

    }
}