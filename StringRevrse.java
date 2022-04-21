public class StringRevrse {
   public static void main(String args[])
   {
    String s="ranjeet";
    
    /*StringBuilder sb=new StringBuilder(s);
    String rev=sb.reverse().toString();
    System.out.print(rev);
    System.out.println();

    for(int i=s.length()-1;i>=0;i--)
    {
        System.out.print(s.charAt(i));
    } */
    char target='n';
    String ans="";
    int ind=0;
    for(int i=0;i<s.length();i++)
    {
        if(s.charAt(i)==target)
        {
          ind=i;
        }
    }
    StringBuilder b=new StringBuilder(s);
    System.out.print(b.deleteCharAt(ind));
    /*
    for(int i=0;i<s.length();i++)
    {   
        if(s.charAt(i)==target)
        {

        }
        else{
        System.out.print(s.charAt(i));
        }
    }*/     
   }
}
