import java.util.Scanner;

public class BitwiseOddEven {
    static boolean checkEvenOdd(int no){
        System.out.println(no&1);
       if((no & 1)==0)
       {
        return true;
       }
        return false;
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter no to check odd or even:");
      int no=sc.nextInt();
      boolean check=checkEvenOdd(no);
      if(check==true)
      {
        System.out.print("Even");
      }
      else{
        System.out.print("odd");
      }
      
      
    }
}
