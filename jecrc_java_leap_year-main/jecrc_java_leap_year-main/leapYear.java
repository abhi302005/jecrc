public class leapYear {
    public static void main(String[] args) {
        int year = 2020;
        // checking leap year or not
        if ((year%4 == 0 && year%100 != 0) || year%400 == 0) {
            System.out.println(year + " is a leap year");            
        } else {
            System.out.println(year+ " is not a leap year");
            
        }
    }
}
