public class power_x {
    public static int power_of_x(int n, int y) {
        int m = 1;
        for (int i = 0; i < y; i++) {
            m *= n;
        }
        return m;
    }

    public static void main(String[] args) {
        System.out.println(power_of_x(3, 2));
    }
}
