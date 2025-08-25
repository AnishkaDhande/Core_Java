import java.util.Scanner;
public class odddigit_sum {
    public static void main(String args[])
    
{
    Scanner sc= new Scanner(System.in);
   System.out.println("Enter Number : ");
   int a=sc.nextInt();
   int oddsum=0;
   while(a>0)
   {
    int rem=a%10;
    if(rem%2!=0)
    {
        oddsum=oddsum+rem;
    }
       a=a/10;

   }
      System.out.println("The sum of odd digits is " +oddsum);

}
    
}
