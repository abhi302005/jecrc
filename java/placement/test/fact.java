public class fact {
    static int f(int n){
        // checking factorial
        int sum =1;
        for(int i =2; i<n; i++){
            
            if(n%i == 0){//*check is factorial */
                if(i%2 != 0){ //* if not even */
                    for(int j =2;j<i;j++){
                        if(i%j == 0){
                            sum+=i;
                            System.out.println(i);
                            break;
                        }
                    }
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(f(45));
    }
}
