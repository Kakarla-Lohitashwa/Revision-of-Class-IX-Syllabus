import java.util.Scanner;
class Bus
{
    public static void main(String args[])
    { 
        Scanner in=new Scanner(System.in);
        
        System.out.print("Enter distance travelled: ");
        int s=in.nextInt();
        int f=0;
        
        if (s<=0)
            f=0;
        else if (s<=10)
            f=80;
        else if (s<=20)
            f=80+(s-10)*6;
        else if (s<=30)
            f=80+60+(s-20)*5;
        else if (s>30)
            f=80+60+50+(s-30)*4;
        System.out.println("Fare ="+f);
    }
}