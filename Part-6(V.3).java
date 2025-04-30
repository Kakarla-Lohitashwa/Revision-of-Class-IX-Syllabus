import java.util.Scanner;
class Roots
{
    public static void main(String args[])
    {
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the number: ");
        int n = in.nextInt();
        
        double s = Math.sqrt(n);
        double c = Math.cbrt(n);
        double rs = Math.round(s);
        double rc = Math.round(c);
        
        System.out.println("Square root="+s);
        System.out.println("Final Result ="+rs);
        System.out.println("Cube root="+c);
        System.out.println("Final result="+rc);
    }
}