import java.util.Scanner;

public class NearestPrimeNo {
  static boolean isPrime(int num){
    for(int i=2;i<num/2;i++)
    {
      if(num%2==0)
      {
        return false;
      }
    }
    return true;
  }
  public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no to check Nearest prime:");
        int no=sc.nextInt();
        for(int i=1;i<no;i++)
        {
              int n1=no+i;
              if(isPrime(n1))
              {
                 System.out.println(n1);
                 break;                
              }
              n1=no-i;
              if(isPrime(n1))
              {
                 System.out.println(n1);
                 break;                
              }           
        }
    }
}
