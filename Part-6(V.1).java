import java.util.Scanner;
class Whole
{
    public static void main(String args[])
    {
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the value of a: ");
        int a = in.nextInt();
        
        System.out.print("Enter the value of b: ");
        int b = in.nextInt();
        
        System.out.print("Enter the value of c: ");
        int c = in.nextInt();
        double x = (1/Math.pow(a,2))+(2/Math.pow(b,2))+(3/Math.pow(c,2));
        long ra = Math.round(x);
        
        System.out.println("Final Result : "+ra);
    }
}