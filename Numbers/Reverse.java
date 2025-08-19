import java.util.Scanner;
public class Reverse {
    public static void main(String args[])
    {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter Number : ");
          int a=sc.nextInt();
          int rev=0;
          while(a>0)
          {
            int rem=a%10;
            rev=rev*10+rem;
            a=a/10;

          }
          System.out.println("Reverrse number is "+rev);
    }
    
}
