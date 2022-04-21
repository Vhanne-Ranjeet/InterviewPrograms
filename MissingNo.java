public class MissingNo
{
    public static void main(String args[])
    {
    int arr[]={1,2,4,5,6};
    int sum=0;
    for(int i=0;i<arr.length;i++)
    {
      sum+=arr[i];
    }
    int nsum=arr.length+1;
    int NatuaralSum=nsum*(nsum+1)/2;
    int missingNo=NatuaralSum-sum;
    System.out.println("First way:"+missingNo);


    int ans=0;
    int ct=1;
    int num=0;
    for(int j=0;j<arr.length-1;j++) 
      {
        ans=arr[j+1]-arr[j];
        if(ans==ct)
        {

        }
        else
        {
            num=arr[j]+1;
            System.out.println("Second way:"+num);
        }
      }
    }  
}
