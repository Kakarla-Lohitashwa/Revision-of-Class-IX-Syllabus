import java.util.*;
class Dealer
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter cost price of article:");
        double cp=in.nextDouble();

        int d=25; int p=25;
        double sp=0.0, mp=0.0;
        
        sp=((100+p)/100.0) * cp;
        System.out.println("Selling price of article = Rs. " + sp);
        
        mp=(100.0/(100-d)) * sp;
        System.out.println("Marked price of article = Rs. " + mp);
    }
}