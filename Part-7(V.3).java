import java.util.Scanner;
class Roots
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
        if (d >= 0) {
            System.out.println("Roots are real.");
            double r1=(-b+Math.sqrt(d))/(2*a);
            double r2=(-b-Math.sqrt(d))/(2*a);
            System.out.println("Roots of the equation are:");
            System.out.println("r1="+r1+",r2="+r2);
        }
        else
        System.out.println("Roots are imaginary.");
    }
}