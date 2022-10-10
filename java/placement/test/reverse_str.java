// import java.util.*;
// import java.io.*;
public class reverse_str {
    static int fbi(int n){
        int v1 = 1;
        int v2 = 2;
        int v3 = 3;
        int m = 0;
        int count  = 2;
        int sum = v3+v1+v2;
        for(;count <= n;){
            System.out.println(sum);
            m =v3+ v2+ v1;
            if(v3%2 != 0){
                count++;
                sum += v3;
            }
            v1 = v2;
            v2 = v3;
            v3 = m;
        }
        
        return sum-5;
    }
public static void main(String[] args) {

        // String str = ""+st.toString();
        // System.out.println(str);
        System.out.println(fbi(10));

        

    }
}
