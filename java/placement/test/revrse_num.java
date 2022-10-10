public class revrse_num {
    public static long rev_num(long n) {
        if (n < 10)
            return n;
        long r = 0;

        while (n != 00) {
            long rem = n % 10;
            r = r * 10 + rem;
            n /= 10;
            System.out.println(n);
        }
        return r;
    }

    public static int add_v(int n, int x) {
        if (n < 10) {
            if ((n + x) > 10) {
                return (n + x) % 10;
            }
            return n + x;
        }
        int r = 0;
        while (n != 00) {
            int rem = n % 10;
            rem += x;
            if (rem > 10) {
                rem %= 10;
            }
            r = r * 10 + rem;
            n /= 10;
        }
        n = 0;
        while (r != 0) {
            int rem = r % 10;
            n = n * 10 + rem;
            r /= 10;
        }
        return n;
    }

    public static void main(String[] args) {
        int x = add_v(12345, 2);
        System.out.println(x);
    }
}
