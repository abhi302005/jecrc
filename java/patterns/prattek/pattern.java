/**
 * pattern
 */
public class pattern {

    public static void main(String[] args) {
        for(int i=1;i<5;i++)
        {
            
            for(int j=1;j<10;j++)
            {
                System.out.print(" ");
                
                
                
                    int num = j;
                    if (i == j || j > num) {
                        System.out.print(num);
                        num--;

                    } else if (j < i) {
                        System.out.print(j);

                    }

                    if (num <=0)
                    {
                        System.out.print(num);
                        break;
                        
                    }
                        

           
               
            }
            System.out.println("");
            
        }
    }
}