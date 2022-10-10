package coding_monk;

public class binary_num {
    static String reverse(String str) {
        char ch;
        String nstr = "";
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i); // extracts each character
            nstr = ch + nstr; // adds each character in front of the existing string
        }
        str = nstr;
        return str;
    }

    static void num(long num) {
        // if / by 2 then 0 else 1
        // num /= 2;

        String s = "";
        long n;
        int i = 1;
        while (i <= num) {
            n = i;
            while (n > 0) {
                if (n % 2 == 0) {
                    s = "0" + s;
                    n /= 2;
                } else {
                    s = "1" + s;
                    n /= 2;
                }
                // n++;
            }
            // s = reverse(s);
            n = Long.parseLong(s);
            // return n;
            System.out.println(n);
            // n = 0;
            s = "";
            i++;
        }
    }

    public static void main(String[] args) {
        // System.out.println(num(542));
        num(15);

    }
}
