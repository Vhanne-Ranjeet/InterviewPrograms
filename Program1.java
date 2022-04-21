import java.util.Arrays;
import java.util.HashMap;
;public class Program1 {
    public static void main(String args[])
    {
        int arr[]={3,4,5,1,2};
        int target=7; 
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int z=0;z<arr.length;z++)
        {
            int secondNo=target-arr[z];
            if(map.containsKey(secondNo))
            {
                System.out.print(secondNo+" "+arr[z]);
                System.out.println();
            }
            else{
                map.put(arr[z], z);
            }
        } 
        System.out.println();
       /* Arrays.sort(arr);
        
        int left=0;
        int sum=0;
        int right=arr.length-1;
        while(left<right)
        {
           sum=arr[left]+arr[right];
           if(sum>target)
           {
               right--;
           }
           else if(sum<target){
               left++;
           }
           else{
               System.out.println(arr[left]+" "+arr[right]);
               left++; 
           }
        }*/
    }   
}
