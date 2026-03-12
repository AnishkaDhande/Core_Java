import java.util.Scanner;
import java.util.Arrays;

public class Asc_des_sort {
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
         
        System.out.println("Hello ! Welcome to array Sorting program");
        //int a[] = { 5, 2, 1, 4, 8, 9 };
        System.out.println("Before Sorting ");
        System.out.println(Arrays.toString(a));
        System.out.println("After Sorting ");
        if (a.length % 2 != 0) {
            int start = 0, end = ((a.length - 1) / 2);
            // sort elements before middle element
            Arrays.sort(a, start, end);
            start = (a.length / 2) + 1;
            end = a.length - 1;
            // System.out.println(Arrays.toString(a));// yala of for each loop aahe
            Arrays.sort(a, start, a.length - 1);
            while (start <= end) {
                int c = a[start];
                a[start] = a[end];
                a[end] = c;
                start++;
                end--;

            }
            System.out.println(Arrays.toString(a));
        } else {
            int start = 0, end = a.length / 2;
            // Sort before middle element
            Arrays.sort(a, start, end);
            //System.out.println(Arrays.toString(a)); 
            /*
             * for (int i : a) {
             * System.out.print(i + " ");
             * }
             */
            start = a.length / 2;
            end = a.length - 1;
            Arrays.sort(a, start, a.length);
            while (start <=end) {
                int c = a[start];
                a[start] = a[end];
                a[end] = c;
                start++;
                end--;
            }
            System.out.println(Arrays.toString(a));

        }
    }
}
