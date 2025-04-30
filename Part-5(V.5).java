import java.io.*;

class Swap
{
    public static void main(String[] args) throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter first number");
        int a=Integer.parseInt(in.readLine());
        System.out.print("Enter second number: ");
        int b=Integer.parseInt(in.readLine());
        int q=a;
            a=b;
            b=q;
        System.out.println("Value is a is:"+a);
        System.out.println("Value is b is:"+b);
    }
}