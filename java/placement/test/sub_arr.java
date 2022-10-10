// import java.util.Arrays;
public class sub_arr {
    public static void main(String[] args) {
        // [1,2,3,4,5]
        int [] arr= {1,2,3,4,5};

        // int target = 16;
        // int sum= 0;
        // int min_ele = arr.length+1;
        int max_sum = arr[0];
        for(int i =0; i<arr.length;i++){
            int m = arr.length;
            for(int j= i; j<arr.length;j++){
                int ele = 0;
                int sum = 0;
                ele++;
                sum += arr[i];
                // System.out.print(arr[i]+" ");
                for(int k= i+1; k<m; k++){
                    ele++;
                    sum += arr[k];
                    // System.out.println(sum+);
                    // System.out.print( "-");
                    
                    // System.out.print(arr[k]+" ");
                }
                // System.out.println("=>"+sum);
                
                if(max_sum < sum){
                    max_sum = sum;
                    // System.out.println(");
                    
                }
                m--;
                // System.out.println(sum);
                // System.out.println();
                
                
                
            }
        }
        System.out.println(max_sum);
        
        // if(min_ele>arr.length){
        //     System.out.println("sum not found");
            
        // }else
        // System.out.println("\n "+ min_ele);
        // }



    }
}

