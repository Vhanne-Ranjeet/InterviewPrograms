import java.lang.*;
import java.util.*;
class Ranjeet{
    public static void main(String args[])
    {
        int arr[]={3,4,5,1,2};
        int target=7;
        int left=0;
        int sum=0;
        int right=arr.length-1;
        while(left<right)
        {
           sum=arr[left]+arr[right];
           if(sum==target)
           {
               System.out.println();
               System.out.print(arr[left]+" "+arr[right]);
           }
        }
    }   
    
} 