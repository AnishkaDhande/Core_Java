//find last position of element
import java.util.Scanner;
public class Element_Last_position {
    public static void main(String[] args) {
        boolean found=false;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an Array");
        int n=sc.nextInt();
        int a[]=new int[n];
        
        System.out.println("Enter elements in Array");
        for(int i=0;i<=a.length-1;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter Element to be Search");
        int s=sc.nextInt();
        for(int i=a.length-1;i>=0;i++)
        {
            if(s==a[i])
            {
                found=true;
                System.out.println("Last position at element found is "+(i+1));
                break;
            }
        }
        if(found==false)
        {
            System.out.println("elment Not Found");
        }

    }
}
