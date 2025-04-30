import java.util.Scanner;
class Time
{
    public static void main(String args[])
    { 
        Scanner in = new Scanner(System.in);
        
        System.out.print("Time in seconds: ");
        int T = in.nextInt();
        
        int h = T /3600;
        int m = (T%3600)/60;
        int s = (T%3600)%60;
        
        System.out.println(h+ " Hours " + m + " Minutes " + s + " Seconds");
    }
}