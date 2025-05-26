// WRITE A PROGRAM TO FIND DIFFERENCE BETWEEN TWO DATES
// INPUT = 13/07/2002, 19/11/2020

import java.util.Scanner;
class dateDiff{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first date in dd/mm/yyyy format");
        String date1 = sc.nextLine();
        System.out.println("Enter the second date in dd/mm/yyyy format");
        String date2 = sc.nextLine();
        
        String[] date1Parts = date1.split("/");
        String[] date2Parts = date2.split("/");
        
        int day1 = Integer.parseInt(date1Parts[0]);
        int month1 = Integer.parseInt(date1Parts[1]);
        int year1 = Integer.parseInt(date1Parts[2]);
        
        int day2 = Integer.parseInt(date2Parts[0]);
        int month2 = Integer.parseInt(date2Parts[1]);
        int year2 = Integer.parseInt(date2Parts[2]);
        
        // Calculate the difference in days
        int daysDiff = (year2 - year1) * 365 + (month2 - month1) * 30 + (day2 - day1);
        
        System.out.println("Difference between two dates is: " + daysDiff + " days");
    }
}