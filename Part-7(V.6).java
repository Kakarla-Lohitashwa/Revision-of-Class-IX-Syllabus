import java.util.Scanner;
class Bank
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        
        System.out.print("Enter sum: ");
        double sum=in.nextDouble();
        System.out.print("Enter age: ");
        int age=in.nextInt();
        System.out.print("Enter term: ");
        double t=in.nextDouble();
        
        double i=0.0;
        
        if (t <= 1 && age<60)
            i=(sum*7.5*t)/100;
        else if (t <= 1 && age >= 60)
            i=(sum*8.0*t)/100;
        else if (t <= 2 && age<60)
            i=(sum*8.5*t)/100;
        else if (t <= 2 && age >= 60)
            i=(sum*9.0*t)/100;
        else if (t <= 3 && age<60)
            i=(sum*9.5*t)/100;
        else if (t <= 3 && age >= 60)
            i=(sum*10.0*t)/100;
        else if (t>3 && age<60)
            i=(sum*10.0*t)/100;
        else if (t>3 && age >= 60)
            i=(sum*11.0*t)/100;
            
        double a=sum+i;
        
        System.out.println("Amount Deposited: "+ sum);
        System.out.println("Term: "+ t);
        System.out.println("Age: "+ age);
        System.out.println("Interest Earned: "+ i);
        System.out.println("Amount Paid: "+ a);
    }
}