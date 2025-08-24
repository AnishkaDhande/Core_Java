import java.util.Scanner;
public class fibboinacinthterm {
    public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
        
        int a=0,b=1,c=0;
        System.out.println("Enter Number");
        int n=sc.nextInt();
        if(n==1)
        {
            System.out.println(a);
        }
         else if(n==2)
        {
            System.out.println(b);
        }
        else {for(int i=3;i<=n-2;i++)
        {
           c=a+b;
           /*System.out.println(c);*/
           a=b;
           b=c;
        }
        System.out.println(c);
    }
    
}
}
