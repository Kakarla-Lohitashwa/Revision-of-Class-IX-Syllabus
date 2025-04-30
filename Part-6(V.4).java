import java.util.Scanner;
class Sphere
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter volume of sphere: ");
        double v=in.nextDouble();
        double r=Math.cbrt(v*(3/4.0)*(7/22.0));
        System.out.println("Radius of sphere="+r);
    }
}