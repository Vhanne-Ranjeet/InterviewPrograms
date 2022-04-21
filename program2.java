import java.util.HashMap;

public class program2 {
    public static void main(String args[])
    {
        int arr[]={3,3,2,1,4,1,2,1};
        int n=arr.length;   
        int i,j;
        for(i=0;i<n;i++)
        { 
            for(j=0;j<n;j++)
            {
                if(i==j)
                {
                    continue;
                }
                if(arr[i]==arr[j])
                {
                    break;
                }
            }
            if(j==arr.length)
            {
             System.out.print(arr[i]+" ");
            }
        }
        //int arr[]={3,3,2,1,4,1,2,1};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int k=0;k<n;k++)
        {
            if(map.containsKey(arr[k]))
            {
              map.put(arr[k],map.get(arr[k])+1);    
            }
            else{
                map.put(arr[k],1);
            }    
        }
        for(int k=0;k<n;k++)
        {
            if(map.get(arr[k])==1)
            {
                System.out.print(arr[k]);
            }
        }
    }
}
