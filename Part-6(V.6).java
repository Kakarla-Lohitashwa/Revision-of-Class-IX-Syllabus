import java.util.Scanner;
class Quadratic
{
    public static void main(String args[])
    { 
        Scanner in=new Scanner(System.in);
        
        System.out.print("Enter a: ");
        int a=in.nextInt();
        System.out.print("Enter b: ");
        int b=in.nextInt();
        System.out.print("Enter c: ");
        int c=in.nextInt();
        
        double d=Math.pow(b,2)-(4*a*c);
        double ans=Math.round(d);
        
        System.out.println("Discriminant to the nearest whole number="+ans);
    }
    
}