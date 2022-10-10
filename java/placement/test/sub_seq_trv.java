import java.util.ArrayList;

public class sub_seq_trv {
    static void trv(ArrayList<Integer> num, int index, ArrayList<Integer> op, ArrayList<Integer> ans) {
        if (index >= num.size()) {
            System.out.print(op);
            System.out.println();
            // ans.addAll(op);
            return;
        }
        // exclude
        int ele = num.get(index);
        op.add(ele);
        trv(num, index + 1, op, ans);
        op.remove(op.size() - 1);
        // include
        trv(num, index + 1, op, ans);

        // return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> n = new ArrayList<>();
        int index = 0;
        ArrayList<Integer> op = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();

        n.add(1);
        n.add(3);
        n.add(2);
        n.add(4);

        trv(n, index, op, ans);

    }
}
