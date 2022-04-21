class NthPrimeNo{
    public static void main(String args[]){
        int count=0,flag=0;
        int nth=5;
        for(int i=100;i>0;i++)//numbers
        {
            flag=0;
            for(int j=2;j<i;j++)//checking 
            {
                if(i%j==0)
                {
                    flag=1;
                    break;//if divide any other no then break because its not prime;
                }
                
            }
            if(flag==0)
                {
                    count++;
                }
                if(count==nth)
                {
                    System.out.println(i);
                    return;
                }
        }

    }
}