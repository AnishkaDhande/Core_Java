import java.util.Scanner;
import java.util.Arrays;
public class Second_Largest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
System.out.println("Enter Size of Array");
        int n=sc.nextInt();
        int a[] =new int[n];
        System.out.println("Enter "+n+" Elements in Array");
        for(int i=0;i<=a.length-1;i++)
        {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println("Second Largest Element in Array is "+a[a.length-2]);
    }
    
}
