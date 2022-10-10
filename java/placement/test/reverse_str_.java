// import java.util.Arrays;

public class reverse_str_ {
    /* reverse string from given point */
    public static String st(String s, int i) {
        if (s.length() < i) {
            System.out.println("-");
            return "";
        }
        String str = "";
        char[] ar = s.toCharArray();
        int j = ar.length - 1;
        for (int x = i - 1; x < ar.length; x++) {
            if (x > j)
                break;
            char t = ar[x];

            ar[x] = ar[j];
            ar[j] = t;
            j--;
        }
        for (int x = 0; x < ar.length; x++) {
            str += ar[x];
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(st("Abhay", 3));
    }
}
