import java.util.*;
class Ci
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the principal amount.");
        int P= in.nextInt();
        double A; double CI;
        int R1=6;
        int R2=8;
        int R3=10;
        double T=3.0;

        A=P*Math.pow(1+(R1/100.0),T)*Math.pow(1+(R2/100.0),T)*Math.pow(1+(R3/100.0),T);
        System.out.println("Amount after 3 years="+A);
        CI=A-P;
        System.out.println("Compound Interst="+CI);
    }
}