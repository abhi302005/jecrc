import java.util.*;
public class rmv_Dup {
    public static void main(String[] args) {
        Set<Integer> data = new HashSet<Integer>();
        try(Scanner sc = new Scanner(System.in)){
            String st = sc.nextLine();
            int [] a = Arrays.stream(st.split(" ")).mapToInt(Integer::parseInt).toArray();
            for(int i = 0; i< a.length; i++){
                data.add(a[i]);
            }
            System.out.println( Arrays.toString(data.toArray()));
            
        }catch(Exception e){
            System.out.println("input stream error"+e);
            
        }
    }
}
