import java.util.Scanner;
class Train
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter 1 for trains travelling in same direction");
        System.out.println("Enter 2 for trains travelling in opposite direction");
        System.out.print("Enter your choice: ");
        int choice=in.nextInt();
        
        System.out.print("Enter first train velocity: ");
        double s1=in.nextDouble();
        System.out.print("Enter first train length: ");
        double l1=in.nextDouble();
        
        System.out.print("Enter second train velocity: ");
        double s2=in.nextDouble();
        System.out.print("Enter second train length: ");
        double l2=in.nextDouble();
        
        double rs=0.0;
        
        switch(choice) {
            case 1:
                rs=Math.abs(s1-s2);
                break;
                
            case 2:
                rs=s1+s2;
                break;
                
            default:
                System.out.println("Wrong choice!");
        }
        
        double t=(l1+l2) / rs;
        
        System.out.println("Relative Velocity="+rs);
        System.out.println("Time taken to cross="+t);
    }
}