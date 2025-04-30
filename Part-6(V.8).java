import java.util.Scanner;

class ci
{
    public static void main(String args[]) 
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter principal: ");
        double P = in.nextDouble();
        
        System.out.print("Enter the rate for 1st year: ");
        double r1 = in.nextDouble();
        System.out.print("Enter the rate for 2nd year: ");
        double r2 = in.nextDouble();
        System.out.print("Enter the rate for 3rd year: ");
        double r3 = in.nextDouble();
        
        double A = P * (1 + (r1 / 100)) * (1 + (r2 / 100)) * (1 + (r3 / 100));
        double ci = A-P;
        
        System.out.println("Amount after 3 years: Rs."+A);
        System.out.println("Compound Interest: Rs."+ci);
    }
}