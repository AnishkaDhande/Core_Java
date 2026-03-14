//Write a program to remove duplicate from Array by converting Array to hashSet or Set

import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
public class Remove_duplicate_Set {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an Array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter "+n+" elements in Array");
        for(int i=0;i<=a.length-1;i++)
        {
            a[i]=sc.nextInt();
        }
        //HashMap does not allow duplicate element and store data in sorted order
        Set<Integer> s=new HashSet<>();
             for(int i=0;i<=a.length-1;i++)
             {
                  s.add(a[i]);
             }
             System.out.println(s);

    }
}
