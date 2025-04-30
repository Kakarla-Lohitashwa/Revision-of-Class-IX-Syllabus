import java.util.*;
class Sum
{ 
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a odd natural number:");
        int n = in.nextInt();
        System.out.println("Number of odd natural terms = " + n);
        double sum = Math.pow(n,2); 
        System.out.println("Sum="+sum);
        
    }
}