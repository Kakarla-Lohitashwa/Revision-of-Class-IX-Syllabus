import java.util.Scanner;
class Car
{
    public static void main(String args[])
    {
        
        Scanner in=new Scanner(System.in);
        
        System.out.println("Enter One year old car");
        System.out.println("Enter Two year old car");
        System.out.println("Enter Three year old car");
        System.out.println("Enter Four year old car");
        System.out.println("Enter five for more than four year old car");

        System.out.print("Enter your choice: ");
        int choice=in.nextInt();
        
        if (choice<1||choice>5) 
        {
            System.out.println("Wrong choice!");
            return;
        }
        
        System.out.print("Enter showroom price: ");
        double p=in.nextDouble();
        double dv=0.0;
        
        switch(choice) {
            case 1:
                dv=0.1*p;
                break;
            
            case 2:
                dv=0.2*p;
                break;
            
            case 3:
                dv=0.3*p;
                break;
            
            case 4:
                dv=0.5*p;
                break;
            
            case 5:
                dv=0.6*p;
                break;
            
            default:
                System.out.println("Wrong choice!");
                break;
        }
        
        double a=p-dv;
        
        System.out.println("Original Price="+p);
        System.out.println("Depricated Value="+dv);
        System.out.println("Amount to be paid="+a);
    }
}