import java.util.Scanner;
public class test{
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("type Hello World");
            String str = sc.nextLine();
            System.out.println("type 9664428172");
            long mob = sc.nextLong();
            System.out.println(str);
            System.out.println(mob);
        } catch(Exception e){
            System.out.println("Exception caught \n"+e);
            }
        
    }
}