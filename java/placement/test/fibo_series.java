import java.util.ArrayList;

public class fibo_series {
    public static ArrayList<Integer> print_f(int x) {
        ArrayList<Integer> f = new ArrayList<>();
        int v1 = 1, v2 = 2, v3 = 0;
        f.add(v1);
        f.add(v2);
        for (int i = 0; i < x - 2; i++) {
            v3 = v1 + v2;
            f.add(v3);
            v1 = v2;
            v2 = v3;
        }
        return f;
    }

    public static void main(String[] args) {
        System.out.println(print_f(6));
    }
}
