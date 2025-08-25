import java.util.Scanner;
public class Productdivident {
    public static void main(String args[])
    {
         Scanner sc= new Scanner(System.in);
         System.out.println("Enter Number");
         int n=sc.nextInt();
         System.out.println("Enter divisor");
         int d= sc.nextInt();
         int mul=1;
         while(n>0)
         {
              int rem=n%10;
              mul=mul*rem;
              n=n/10;
         }
         System.out.println(mul);
         if(mul%d==0)
         {
          System.out.println("Divisible");
         }
         else
         System.out.println("Not Divisible");

    }
    
}
