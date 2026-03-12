import java.util.Scanner;
public class Second_Largest1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    System.out.println("Enter Size of Array");
    int n=sc.nextInt();
    int a[]=new int[n];
    System.out.println("Enter "+n+ " Elements in Array ");
    for(int i=0;i<=a.length-1;i++)
    {
     a[i]=sc.nextInt();
    }
     int largest=a[0];
     for(int i=1;i<=a.length-1;i++)
     {
        if(a[i]>largest)
        {
            largest=a[i];
        }
     }
   // System.out.println("Largest Element is"+largest);
    int Second_Largest=0;
         for(int i=0;i<=a.length-1;i++)
         {
            if(a[i]>Second_Largest)
            {
                if(a[i]==largest)
            {
                continue;
            }
                Second_Largest=a[i];
            }
         }
         System.out.println("The Largest element is "+largest);
         System.out.println("The Second Largest Element is "+Second_Largest);
    }
    
}
