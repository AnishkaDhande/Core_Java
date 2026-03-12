//Write a java program to reverse an array of integer values
import java.util.Scanner;
import java.util.Arrays;
public class Reverse_Array_Element {
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

    System.out.println("Before Swap "+Arrays.toString(a));
            int  start=0;
            int end=a.length-1;
    
            while(start<=end)
            {
                int c=a[start];
                a[start]=a[end];
                a[end]=c;
                start++;
                end--;
            }
            System.out.println("After Swapping "+Arrays.toString(a));
            //or to print after swapping elements
            /*for(int i:a)
            {
              System.out.println(i);
            }*/
    }
}
