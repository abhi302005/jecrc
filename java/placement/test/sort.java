import java.util.*;
public class sort {
    public static void main(String [] args){
        try(Scanner sc = new Scanner(System.in)){
            String st = sc.nextLine();

            int [] a = Arrays.stream(st.split(" ")).mapToInt(Integer::parseInt).toArray();
            Arrays.sort(a);
            System.out.println(Arrays.toString(a));
        }
    }
}
