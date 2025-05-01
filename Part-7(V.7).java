import java.util.Scanner;
class Courier
{
    public static void main(String args[])
    {   
        Scanner in=new Scanner(System.in);
        
        System.out.print("Enter weight: ");
        double wt=in.nextDouble();
        
        System.out.print("Enter type: ");
        char t=in.next().charAt(0);
        double c=0;
        if (wt <= 0)
            c=0;
        else if (wt <= 100 && t == 'O')
            c=80;
        else if (wt <= 100 && t == 'E')
            c=100;
        else if (wt <= 500 && t == 'O')
            c=150;
        else if (wt <= 500 && t == 'E')
            c=200;
        else if (wt <= 1000 && t == 'O')
            c=210;
        else if (wt <= 1000 && t == 'E')
            c=250;
        else if (wt>1000 && t == 'O')
            c=250;
        else if (wt>1000 && t == 'E')
            c=300;
            
        System.out.println("Parcel charges="+c);
    }
}