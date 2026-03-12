import java.util.Scanner;
import java.util.Arrays;
public class String_Array_Sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of Array ");
        int n=sc.nextInt();
        String s[]=new String[n];
        System.out.println("Enter "+n+" words in Array");
        for(int i=0;i<=s.length-1;i++)
        {
            s[i]=sc.next();
        }
        Arrays.sort(s);
        System.out.println("Sorted Array ");
        for(int i=0;i<=s.length-1;i++)
        {
            System.out.println(s[i]+" ");
        }

    }
}
