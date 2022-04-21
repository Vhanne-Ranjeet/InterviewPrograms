public class seggZeroOneTwo {
static void swap(int arr[],int a,int b){
  int temp=arr[a];
  arr[a]=arr[b];
  arr[b]=temp;
}
    public static void main(String args[])
   {
    int arr[]={0,1,2,0,1,2,2,1,0};
       int l=0,m=0,h=arr.length-1;
       while(m<=h)
       {
           if(arr[m]==0)
           {
               swap(arr,l,m);
               l++;
               m++;
           }
           if(arr[m]==1)
           {
               m++;
           }
           if(arr[m]==2)
           {
             swap(arr,h,m);
            h--;
           }
       }
       for (int i=0;i<arr.length;i++) {
           System.out.print(arr[i]);
       }
   } 
}
