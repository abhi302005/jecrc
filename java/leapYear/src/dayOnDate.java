// import java.util.Scanner;
// import java.lang.String;


public class dayOnDate {
      

    static int monthCodeCalc(int m) {
        int monthCode[] = { 0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5 };
        int $monthCode = monthCode[m - 1];

        return $monthCode;
    }

    int centuryCodeCalc(int cc, int yy) {
        
        return 0;
    }
    public static void main(String[] args) {
        // declaring the input object for taking object
        // Scanner input = new Scanner(System.in);
           
         
        // date
        int dd = 14;
        int mm = 2;
        int yy = 2021;

        System.out.println(dd +"-"+mm + "-"+ yy);
        
        // meta information
        // int dayCode[] = { 0, 1, 2, 3, 4, 5, 6 };

        int yearCode = 0;
        int leapCount = 0;
        int $centuryCode =0 ;
        int $monthCode =0 ;
        // int $dayCode =0;

        // checking the century
        int centuryCode[] = { 0, 4, 2, 0, 6 };
        
        if(yy <= 1699 && yy >= 1600){
            $centuryCode = centuryCode[0];
            yearCode = yy - 1600;

        } else if (yy <= 1799 && yy >= 1700) {
            $centuryCode = centuryCode[1];
            yearCode = yy - 1700;

        } else if (yy <= 1899 && yy >= 1800) {
            $centuryCode = centuryCode[2];
            yearCode = yy - 1800;

        } else if (yy <= 1999 && yy >= 1900) {
            $centuryCode = centuryCode[3];
            yearCode = yy - 1900;

        } else if (yy <= 2099 && yy >= 2000) {
            $centuryCode = centuryCode[4];
            yearCode = yy - 2000;

        }

        // checking the month
        $monthCode = monthCodeCalc(mm);
        
        // calculating the leap count
        leapCount = (int) yearCode / 4;

        // checking the day
        // (dd + $monthCode + yearCode + leapCount + $centuryCode)%7
        int result = (dd + $monthCode + yearCode + leapCount + $centuryCode) % 7;
        
        
        switch (result) {
            case 0: System.out.println("sunday");
                    break;
            case 1: System.out.println("monday");
                    break;
            case 2: System.out.println("tuesday");
                    break;
            case 3: System.out.println("wednesday");
                    break;
            case 4: System.out.println("thrusday");
                    break;
            case 5: System.out.println("friday");
                    break;
            case 6: System.out.println("saturday");
                    break;         
            default: System.out.println("error:// day not found");
            
                break;
        }
    }
}
