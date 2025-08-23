import java.util.Scanner;
public class Armstrong {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n=sc.nextInt();
        int count=0;
        int temp=n;
        int sum=0;
        while(temp>0)
        {
          temp=temp/10;
          count++;
        }
        
        temp=n;
        while(n>0)
        {
            int rem =n%10;
            sum=sum+(int)Math.pow(rem,count);
            n=n/10;

        }
          if(temp==sum)
          {
            System.out.println("Armstrong Number");
          }
          else
          {
            System.out.println("Not Armstrong Number");
          }
    }
    
}
