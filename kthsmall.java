import java.util.Arrays;

class kthsmall {
    public static void main(String args[]) {
        int arr[] = { 8, 1, 1, 2, 7, 9 };
        // 1 1 1 2 7 8 9
        // 0 0 1 2 3 4 5
        int k = 4;
        int count=0;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        { 
          if(arr[i]!=arr[i+1])
          {
              count++;
          }
          if(count==k)
          {  
            System.out.print(arr[count]);
            return;
          }
        }
    }
}