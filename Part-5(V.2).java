import java.util.Scanner;
class MobilePhone
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the MRP: ");
        double MRP = in.nextDouble();
        //PRICE AFTER DISCOUNT=p
        double P = MRP - (0.1 * MRP);
        //TOTAL AMOUNT=T
        double t = P+ (P*0.09);
        System.out.println("Price after 10% discount and 9% GST: " + t);
    }
}
