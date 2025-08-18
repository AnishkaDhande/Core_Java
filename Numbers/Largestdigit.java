import java.util.Scanner;
public class Largestdigit {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number");
        int n=sc.nextInt();//12363
        int largest=n%10;//3
        while(n>0)
        {
            int rem=n%10;
              if(rem >largest)
              {
                largest=rem;
              }
            n=n/10;
        }
        System.out.println("The Largest Number is "+largest);

    }
    
}
