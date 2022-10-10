public class prime_or {
    public static boolean isPrime(int x) {
        for (int i = 2; i < x; i++) {
            if (x % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        if (isPrime(13)) {
            System.out.println("prime");
        } else {
            System.out.println("not_prime");
        }
    }
}
