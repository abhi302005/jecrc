import java.util.ArrayList;

public class fact_x {
    public static ArrayList<Integer> fact(int x) {
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 1; i < x; i++) {
            if (x % i == 0) {
                a.add(i);
            }
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(fact(18));
    }
}
