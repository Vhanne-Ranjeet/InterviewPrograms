import java.util.HashSet;
public class RemoveDuplicate {
    public static void main(String args[])
    {
        int arr[]={10,20,30,80,10,60,20,60};
        int n=arr.length; 
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                   System.out.print(arr[i]+" ");
                }
            }    
        }
        System.out.println();
        HashSet<Integer> s=new HashSet<>();

        for(int k=0;k<n;k++)
        {
            s.add(arr[k]);
        }
        for(int i:s)
        {
            System.out.print(i+" ");
        }

    }
}
