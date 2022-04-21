public class DuplicateNo {
    public static void main(String args[])
    {
        int arr[]={80,10,30,80,10,60,30};
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.print(arr[i]+" ");
                }
            }
        }

    }
}
