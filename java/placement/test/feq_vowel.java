
// import java.util.ArrayList;
import java.util.Arrays;
// import java.util.HashMap;

public class feq_vowel {
    /* a, e, i, o, u */

    public static void vowel(String s) {
        int arr[] = new int[5];
        /*
         * a = 0
         * e = 1
         * i = 2
         * o = 3
         * u = 4
         */
        char[] st = s.toCharArray();
        int i = 0;
        while (i < st.length) {
            char a = st[i];
            switch (a) {
                case 'A':
                    arr[0]++;
                    break;
                case 'a':
                    arr[0]++;
                    break;
                case 'E':
                    arr[1]++;
                    break;
                case 'e':
                    arr[1]++;
                    break;
                case 'I':
                    arr[2]++;
                    break;

                case 'i':
                    arr[2]++;

                    break;
                case 'O':
                    arr[3]++;

                    break;
                case 'o':
                    arr[3]++;

                    break;
                case 'u':
                    arr[4]++;

                    break;
                case 'U':
                    arr[4]++;

                    break;
                default:
                    break;
            }
            i++;
        }

        System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args) {
        vowel("String_here");
    }
}
