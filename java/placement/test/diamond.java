// import javax.swing.plaf.synth.SynthOptionPaneUI;

public class diamond {
    public static void rightAngle(String s) {
        char[] st = s.toCharArray();
        for (int i = 0; i < st.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(st[j] + " ");
            }
            System.out.println();
        }
    }

    public static void kite(String s) {
        char[] st = s.toCharArray();

        for (int i = 0; i < st.length; i++) {

            for (int k = st.length - 1; k > i; k--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(st[j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < st.length; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < st.length - i; j++) {
                System.out.print(st[j] + " ");
            }

            System.out.println();
        }
        for (int i = 0; i < st.length - 2; i++) {

            for (int k = st.length - 1; k > i; k--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(st[j] + " ");
            }
            System.out.println();
        }
    }

    public static void l_angle(String s) {
        char[] st = s.toCharArray();
        int space = st.length + 1;
        for (int i = 0; i <= st.length; i++) {
            for (int k = 0; k < space; k++) {
                /* spcae */
                System.out.print("*");
            }
            int word = st.length - 2 - space;
            for (int j = word; j > -1; j--) {
                // System.out.println(j);
                System.out.print(st[j] + " ");
            }
            // System.out.println(space + "<");
            System.out.println();
            space = space - 2;

        }

    }

    public static void main(String[] args) {
        l_angle("Abhay");
    }
}
