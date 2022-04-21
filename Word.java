public class Word {
    public static void main(String args[])
    {
        String s1="This is a string";
        String arr[]=s1.split(" ");
        for(int i=0;i<arr.length;i++)
        {
        System.out.print(arr[i]+" ");
        System.out.print("length:"+arr[i].length()+" ");
        }

    }
}
