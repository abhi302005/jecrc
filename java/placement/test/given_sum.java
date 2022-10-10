import java.util.*;
public class given_sum{
    public static void main(String[] args) {
     try(Scanner sc = new Scanner(System.in)){
        System.out.println("enter size of arr and target");
        int sz = sc.nextInt();
        // int tr  = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0; i<sz; i++){
            int e = sc.nextInt();
            arr.add(e);
        }
        
        // int sum = 0;
        // int pop = 0;
        for (int i = 0; i<sz; i++){
            
        }
        
     }catch(Exception e){
        System.out.println("inp_err\n"+e);
        
     }
    }

}