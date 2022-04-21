class SelectionSort{
    public static void main(String args[])
    {
        int arr[]={20,10,30,40}; 
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            int minIndex=i;
            for(int j=(i+1);j<n-1;j++)
            {
                if(arr[j]<arr[minIndex])
                {
                  minIndex=j;
                }
            }
            int temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }
        for(int k=0;k<n;k++)
        {
            System.out.println(arr[k]);
        }
    }
}