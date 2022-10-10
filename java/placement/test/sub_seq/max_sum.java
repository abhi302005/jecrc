package sub_seq;

import java.util.ArrayList;
// import java.util.Arrays;
import java.util.Collections;

public class max_sum {
    static int add(ArrayList<Integer> arr) {
        int sum = 0;
        for (int val : arr) {
            sum += val;
        }
        return sum;
    }

    // static ArrayList<Integer> max()

    static void maxSum(ArrayList<Integer> num, int index, ArrayList<Integer> op, ArrayList<Integer> s) {
        if (index >= num.size()) {
            // System.out.println(op);
            s.add(add(op));
            return;
        }
        // include;
        op.add(num.get(index));
        // exclude
        maxSum(num, index + 1, op, s);
        op.remove(op.size() - 1);
        maxSum(num, index + 1, op, s);
    }

    public static void main(String[] args) {
        ArrayList<Integer> n = new ArrayList<>();
        int index = 0;
        ArrayList<Integer> op = new ArrayList<>();
        ArrayList<Integer> s = new ArrayList<>();
        n.add(1);
        n.add(3);
        n.add(2);
        n.add(-4);

        maxSum(n, index, op, s);
        System.out.println(s);
        Collections.sort(s);
        System.out.println(s.get(s.size() - 1));
    }
}
