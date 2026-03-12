// write ajava program to copy an array by iterrating array
import java.util.Scanner;
public class Copy_Array {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of Array ");
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new  int[n];
        System.out.println("Enter "+n+" words in Array");
        for(int i=0;i<=a.length-1;i++)
        {
            a[i]=sc.nextInt();
        }
         for(int i=0;i<=a.length-1;i++)
         {
            b[i]=a[i];
            
         }
         System.out.println("Elements copied Second Array in Array are ");
         for(int i=0;i<=a.length-1;i++)
         {
            System.out.print(b[i]+" ");
         }
         

    }
}
