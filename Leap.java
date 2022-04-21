import java.util.Scanner;

public class Leap {
    static boolean checkLeapYear(int year){
        if((year%4==0) && (year%100!=0)||year%400==0)
        {
           return true;
        }
        
        return false;
    }
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in); 
       System.out.print("Eneter year to check leap:");
       int year=sc.nextInt();
       boolean check=checkLeapYear(year);
       if(check==true)
       {
        System.out.println("Leap year");
       }
       else{
        System.out.println("Not Leap year");
        System.out.println("next leap year is:");
        for(int i=year;i>0;i++)
        {
            boolean check2=checkLeapYear(i);
            if(check2==true)
            {
                System.out.println(i);
                break;
            }
        }
        
        }

    }
}
