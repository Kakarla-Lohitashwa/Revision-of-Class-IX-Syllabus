import java.util.*;
class Square
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=in.nextInt();
        
        if(n<0) 
        {
            System.out.println("Cannot find square root.");
            System.exit(0);
        }
        else 
        {
            double R=Math.sqrt(n);
            double R1=Math.floor(R);
            double d=R-R1;
            if (d == 0) {
                System.out.println(n+" is a perfect square.");
            }
            else {
                 R1=R1+1;
                 double t=Math.pow(R1,2);
                 d=t-n;
                 System.out.println(n+" is not a perfect square.");
                 System.out.println("Number to be added="+d); 
            }
        }
    }
}