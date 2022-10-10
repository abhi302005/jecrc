import java.util.*;
// import java.lang.*;s
public class union {
    public static void main(String [] args){
        try(Scanner sc = new Scanner(System.in)){
            // System.out.println("enter Size");
            // String sz = sc.nextLine();
            System.out.println("enter ele of 1st arr");
            String st_1 = sc.nextLine();
            System.out.println("enter ele of 2ndt arr");
            String st_2 = sc.nextLine();
            
            int[] arr = Arrays.stream(st_1.split(" ")).mapToInt(Integer::parseInt).toArray();
            int[] arr_2 = Arrays.stream(st_2.split(" ")).mapToInt(Integer::parseInt).toArray();
            
            // check whose length is big
            Set<Integer> union = new HashSet<Integer>();
            for(int i = 0; i< arr.length; i++){
                union.add(arr[i]);
            }
            for(int i = 0 ; i<arr_2.length; i++){
                union.add(arr_2[i]);
            }
            System.out.println(union.size());
        }

    }
}
