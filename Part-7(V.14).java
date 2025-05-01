import java.util.Scanner;
class Bank
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        
        System.out.println("Enter 1 to deposit money");
        System.out.println("Enter 2 to withdraw money");
        System.out.println("Enter 3 to check balance");
        System.out.println("Enter 0 to quit");
        
        System.out.print("Enter your choice: ");
        int choice=in.nextInt();

        double a=0.0;
        double b=5000.0;
        
        switch(choice)
        {
            case 1:
                System.out.println("Thanks");
                break;
                
            case 2:
                System.out.print("Enter deposit amount : ");
                a=in.nextDouble();
                b=b+a;
                System.out.println("Money deposited.");
                System.out.print("Total balance="+b);
                break;
                
            case 3:
                System.out.print("Enter withdrawal amount : ");
                a=in.nextDouble();
                if(a > b)
                System.out.println("Insufficient balance.");
                else 
                {
                    b-=a;
                    System.out.println("Money withdrawn.");
                    System.out.print("Total balance="+b);
                }
                break;   
            case 4:
                System.out.print("Total balance="+b);
                break; 
             default:
                System.out.println("Invalid");
        }
    }
}