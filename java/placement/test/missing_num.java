import java.util.*;
public class missing_num{
    public static void main(String[] args){
        ArrayList <Integer> arr = new ArrayList<>();
        int n =-1;

        System.out.println("enter sz");
        try(Scanner sc = new Scanner(System.in)){
            for(int i = 0; i<n; i++){
                int e = sc.nextInt();
                arr.add(e);
            }
            Collections.sort(arr);
            int f = arr.get(0);
            for(int i =0 ;i<arr.size();i++){
                if(f!=arr.get(i)){
                    System.out.println(f);
                }
                f++;
            }
        }
    }

}