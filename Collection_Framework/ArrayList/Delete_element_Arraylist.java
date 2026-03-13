//write a program to delete value from particular index in Array //we covert Array to ArrayList

import java.util.Scanner;
import java.util.ArrayList;

public class Delete_element_Arraylist{
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
        //covert array to arraylist 
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<=a.length-1;i++)
        {
            list.add(a[i]);
        }
        System.out.println(list);
        System.out.println("Enter index of element");
        int b=sc.nextInt();
        list.remove(b);
        System.out.println(list);

    
}
    
}
