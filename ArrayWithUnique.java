import java.util.LinkedHashSet;

class ArrayWithUnique{
    static String [] makeUnique(String arr[]){
        LinkedHashSet<String>ls=new LinkedHashSet<>();
        for(int i=1;i<arr.length;i++){
            ls.add(arr[i]);
        }
        System.out.println(ls);
        return arr;
    }

    public static void main(String args[])
    {
        String arr[]={"John","Paul","George","John"};
        String unique[]=makeUnique(arr);
    }
}