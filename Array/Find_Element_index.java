//Write a program to find index of element in array

import java.util.Scanner;
public class Find_Element_index {
    public static void main(String[] args) {
        boolean found=false;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter "+n+" Elements in Array");
        for(int i=0;i<=a.length-1;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter element to be search");
        int c=sc.nextInt();
        for(int i=0;i<=a.length-1;i++)
        {
            if(c==a[i])
                {
           System.out.println("Index of Element is "+i);
           found=true;
           break;
                }
        }
        if(found==false)
        {
            System.out.println("Element Not Found ");
        }
    }
    }

