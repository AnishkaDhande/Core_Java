import java.util.Scanner;
public class evendigit_sum {
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter Number : ");
     int a=sc.nextInt();
     int evensum=0;
     while(a>0)
     {
        int rem=a%10;
        if(rem%2==0)
        {
            evensum=evensum+rem;
        }
        a=a/10;
     }
     System.out.println("Sum of Even Digits is "+evensum);
    }
    
}
