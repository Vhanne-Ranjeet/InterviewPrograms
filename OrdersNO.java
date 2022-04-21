public class OrdersNO {
    
public static void main(String args[])
{
    int n=34567;
    int unit=n%10;
    int tens=n%100-unit;
    int hundread=n%1000-tens-unit;
    int thousand=n%10000-hundread-tens-unit;
    int lack=n%100000-thousand-hundread-tens-unit;
    System.out.print(lack+"+"+thousand+"+"+hundread+"+"+tens+"+"+unit);
}    

}
