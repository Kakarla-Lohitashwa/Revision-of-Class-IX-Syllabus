class Driver
{
    public static void main(String args[])
    {
        
        int d=240;
        double s=60.0;
        double RS=s-20;
        
        double t2=d/s;
        t2=d/RS;
        double T=t2+t2;
        
        double Avg=(d*2)/T;
        
        System.out.println("Total time:"+T);
        System.out.println("Average speed:"+Avg);
    }
}