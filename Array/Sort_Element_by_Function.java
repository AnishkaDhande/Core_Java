//write a program to sort numeric array and string array
import java.util.Scanner;
import java.util.Arrays;
public class Sort_Element_by_Function {
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
  
    Arrays.sort(a);
    System.out.println("Sorted Array ");
    for(int i=0;i<=a.length-1;i++)
    {
        System.out.println(a[i]+" ");
    }
}
}