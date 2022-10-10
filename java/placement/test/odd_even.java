import java.util.*;

public class odd_even{
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            String st = sc.nextLine();
            int [] a = Arrays.stream(st.split(" ")).mapToInt(Integer:: parseInt).toArray();
            int [] odd = new int[20];
            Arrays.fill(odd, 0);
            
            int [] even = new int[20];
            Arrays.fill(even, 0);
            System.out.println(Arrays.toString(odd));
            System.out.println(Arrays.toString(even));

            System.out.println();
            
            int i = 0;
            int j= 0;
            for(int val: a){

                System.out.println(val);
                
               if(val %2 == 0){
                even[i] = val;
                i++;
               } else{
                odd[j] = val;
                j++;
               }
            }
            System.out.println(Arrays.toString(odd));
            System.out.println(Arrays.toString(even));
        }
    }
}