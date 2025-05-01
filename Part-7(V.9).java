import java.util.Scanner;
class Number
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a=in.nextInt();
        System.out.print("Enter second number: ");
        int b=in.nextInt();
        System.out.print("Enter third number: ");
        int c=in.nextInt();
        int high=0;int  mid=0; int least=0; 
        
        System.out.println("Enter 1 for Ascending Order");
        System.out.println("Enter 2 for Descending Order");
        System.out.print("Enter your choice: ");
        int ch=in.nextInt();
        
        if(ch != 1 && ch != 2) 
        System.out.println("Wrong choice.");
        else 
        {
            if(a>b && a>c) 
            {
                high=a;
                if(b>c)
                {
                    mid=b;
                    least=c;
                }
                else
                {
                    mid=c;
                    least=b;
                }
            }
            if(b>a && b>c)
            {
                high=b;
                if(a>c)
                {
                    mid=a;
                    least=c;
                }
                else
                {
                    mid=c;
                    least=a;
                }
            }
            if(c>a && c>b)
            {
                high=c;
                if(a>b)
                {
                    mid=a;
                    least=b;
                }
                else
                {
                    mid=b;
                    least=a;
                }
            }
            
        }
        if(ch == 1) {
            System.out.println("First no: "+least);
            System.out.println("Second no: "+mid);
            System.out.println("Third no: "+high);
            System.out.println("The nos are in increasing order");
        }
        else    {
            System.out.println("First no: "+high);
            System.out.println("Second no: "+mid);
            System.out.println("Third no: "+least);
            System.out.println("The no's are in decreasing order");
        }
            
    }
}