import java.util.Scanner;
class Volume
{
    public static void main(String args[])
    {
        
        Scanner in=new Scanner(System.in);
        System.out.println("Enter 1 for Volume of Cube");
        System.out.println("Enter 2 for Volume of Sphere");
        System.out.println("Enter 3 for Volume of Cuboid");
        System.out.print("Enter your choice: ");
        int choice=in.nextInt();
        
        switch(choice)
        {
            case 1:
                System.out.print("Enter side of cube: ");
                double sc=in.nextDouble();
                double cv=Math.pow(sc,3);
                System.out.println("Volume of cube="+cv);
                break;
                
            case 2:
                System.out.print("Enter radius of sphere: ");
                double r=in.nextDouble();
                double sv=(4/3.0)*(22/7.0)*Math.pow(r,3);
                System.out.println("Volume of sphere="+sv);
                break;
                
            case 3:
                System.out.print("Enter length of cuboid: ");
                double l=in.nextDouble();
                System.out.print("Enter breadth of cuboid: ");
                double b=in.nextDouble();
                System.out.print("Enter height of cuboid: ");
                double h=in.nextDouble();
                double cuv=l*b*h;
                System.out.println("Volume of cuboid="+cuv);
                break;
                
            default:
                System.out.println("Wrong choice!");
        }
    }
}