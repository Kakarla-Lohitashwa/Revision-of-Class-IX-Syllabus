import java.util.Scanner;
class Pythagorean_Triplet
{
    public static void main(String args[])
    {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of s: ");
        int s = in.nextInt();
        
        if (s < 2) 
        {
            System.out.println("Invalid Input");
        }
        
        int a = 2*s;
        int b = (int)(Math.pow(s, 2)-1);
        int c = (int)(Math.pow(s, 2)+1);
        
        System.out.println("Pythagorean Triplets: " + a + ", " + b + ", " + c);
        
    }
}