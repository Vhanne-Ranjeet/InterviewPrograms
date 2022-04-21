import java.util.*;
public class Anagram {
    static boolean isAanagram(String s1,String s2){
        if(s1.length()!=s2.length())
        {
            return false;
        }
        char s1arr[]=s1.toLowerCase().toCharArray();
        char s2arr[]=s2.toLowerCase().toCharArray();
        
        Arrays.sort(s1arr);
        Arrays.sort(s2arr);
        if(Arrays.equals(s1arr, s2arr))
        {
            return true;
        }
        return false;
        
    }
    
    public static void main(String args[]){
     String s1="Listen";
     String s2="silent";
     boolean check=isAanagram(s1,s2);
     System.out.println(check?"Aanagaram":"Not Aanagram");
    }
}
