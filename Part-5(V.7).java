import java.util.Scanner;
class Slope
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter x coordinate of point A: ");
        int x1=in.nextInt();
        System.out.print("Enter y coordinate of point A: ");
        int y1=in.nextInt();
        System.out.print("Enter x coordinate of point B: ");
        int x2=in.nextInt();
        System.out.print("Enter y coordinate of point B: ");
        int y2=in.nextInt();
        
        double Slope=(y2-y1)/(x2 - x1);
        
        System.out.println("Slope of line: "+Slope);
    }
}