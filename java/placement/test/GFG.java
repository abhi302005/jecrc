// import java.util.Arrays;
import java.lang.String;

// Main class 
public class GFG{
    public static void main(String args[]){
        // aabaa
        String st = "aabaa";
        StringBuilder sb = new StringBuilder(st);
        /*
         * if a[i] == a[i1] remove a[i-1]
         */
        for(int i = 1; i < st.length(); i++){
           if( st.charAt(i-1) == st.charAt(i)){
            sb.deleteCharAt(i-1);
           }
        }
        System.out.println(sb);
    }
}
