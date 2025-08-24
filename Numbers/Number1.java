import java.util.Scanner;
public class Number1 {
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter number :");
    int a = sc.nextInt();
    int sum;
    if(a >=1000 && a<10000)//2345
    {
        int w=a%10;//5
        int x=a/10%10;//4
        int y=a/100%10;//3
        int z=a/1000%10;//4
        sum=w+x+y+z;
       System.out.println("Sum is "+sum);
         int evenposs=w+y;
         int oddposs=x+z;
              System.out.println("Even position digit sum is "+evenposs);
              System.out.println("Odd position digit sum is "+oddposs);
              if(evenposs==oddposs)
              {
                System.out.println(1);
              }
        }
    
    else {
        System.out.println(-1);
    }
    }

}