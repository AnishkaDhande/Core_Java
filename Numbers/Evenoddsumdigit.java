import java.util.Scanner;
public class Evenoddsumdigit {
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter number :") ;
     int a=sc.nextInt();
     int evensum=0,oddsum=0;
     while(a>0)
     { 

        int rem=a%10;
        if(a%2==0)
        {
            evensum=evensum+rem;
        }
        else
        {
         oddsum=oddsum+rem;
        }
          a=a/10;
     }
           System.out.println("Even digits sum is "+evensum);
           System.out.println("Odd digits sum is "+oddsum);
    }
    
}
