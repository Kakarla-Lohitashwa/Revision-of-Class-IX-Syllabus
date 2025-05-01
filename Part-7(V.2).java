import java.util.Scanner;
class SpecialNo
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a 2 digit number: ");
        int onum=in.nextInt();
        
        if (onum<10 || onum>99)
        {
            System.out.println("Invalid input");
            System.exit(0);
        }
        
        int num=onum;
        int a=num % 10;
        int b=num/10;
        num /= 10;
        int S=a+b;
        int P=a*b;
        int grandSum=S+P;
        
        if (grandSum == onum)
            System.out.println("Special 2-digit number");
        else
            System.out.println("Not a special 2-digit number");
            
    }
}