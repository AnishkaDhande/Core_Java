import java.util.Scanner;
class FibbonacciOdd
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int n=sc.nextInt();
        int a=0,b=1,c;
        System.out.println(a+" "+b+" ");
        for(int i=1;i<=n-2;i++)
        {
            c=a+b;
            if(c%2!=0)
            System.out.print(c+" ");
            a=b;b=c;
        }
    }

}