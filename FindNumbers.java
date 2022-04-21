public class FindNumbers {
    public static void main(String args[])
    {
        
        int arr[]={-1,0,-3,2,1};
        int sum=-2;
        int sum2=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                sum2=arr[j]+arr[i];
                if(sum2==sum)
                {
                    System.out.println(arr[j]+" "+arr[i]);
                }
            }
        }

        /*int sum2=0;
        for(int i=0;i<arr.length-1;i++) 
        {
           sum2=arr[i]+arr[i+1]; 
           if(sum2==sum)
           {
               System.out.print(arr[i]+" "+arr[i+1]);
           }
        }
        */
    }
    
}
