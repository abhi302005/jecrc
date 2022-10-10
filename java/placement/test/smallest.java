import java.util.*;

public class smallest {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            String st = sc.nextLine();
            int [] a = Arrays.stream(st.split(" ")).mapToInt(Integer::parseInt).toArray();

              Arrays.sort(a);
              int i = 0;
              int j = a.length-1;

              while(i<j){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
              }
            System.out.println(Arrays.toString(a));
            String aa = "ab";
            String b = "ba";
            aa = aa+b;
            System.out.println(aa);
            
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
