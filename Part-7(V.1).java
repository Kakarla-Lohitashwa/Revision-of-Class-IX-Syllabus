import java.util.Scanner;
class Triangle
{
    public static void main(String args[])
    {
        
        Scanner in=new Scanner(System.in);
        
        System.out.println("Please enter the 3 sides of the triangle.");
        System.out.print("Enter the first side: ");
        double a=in.nextDouble();
        System.out.print("Enter the second side: ");
        double b=in.nextDouble();
        System.out.print("Enter the third side: ");
        double c=in.nextDouble();
        
        double w=a+b+c;
        double s=w/2;
        double x=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        
        if (x==w)
            System.out.println("Entered triangle is equable.");
        else 
            System.out.println("Entered triangle is not equable.");
    }
}