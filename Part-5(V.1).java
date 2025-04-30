import java.util.Scanner;
class election
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of voters: ");
        //t=Total Voters
        double t = in.nextDouble();
        //V=Voters who voted
        double V = Math.round(0.8*t);
        double x = Math.round(0.6*V);
        double y = V-x;
        
        System.out.println("Total Votes: " + V);
        System.out.println("Votes of X: " + x);
        System.out.println("Votes of Y: " + y);
    }
}