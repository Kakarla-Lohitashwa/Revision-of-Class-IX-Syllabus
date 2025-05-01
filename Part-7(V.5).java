import java.util.Scanner;
class ICSE
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        
        System.out.print("Enter marks in English: ");
        int e=in.nextInt();
        
        System.out.print("Enter marks in Maths: ");
        int m=in.nextInt();
        
        System.out.print("Enter marks in Science: ");
        int s=in.nextInt();
        
        if (e >= 80 && s >= 80 && m >= 80) 
            System.out.println("Pure Science");
        else if (e >= 80 && s >= 80 && m >= 60)
            System.out.println("Bio and Science");
        else if (e >= 60 && s >= 60 && m >= 60)
            System.out.println("Commerce");
        else
            System.out.println("Can't allot stream");
    }
}