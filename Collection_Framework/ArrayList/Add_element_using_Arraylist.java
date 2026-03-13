//write a program to add element at given index  in array //we convert Array to ArrayList
import java.util.Scanner;
import java.util.ArrayList;
public class Add_element_using_Arraylist {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Entre Size of array");
        int n=sc.nextInt();
        int a[]=new int[n]; 
        System.out.println("Enter Elements "+n+" in Array");
       for(int i=0;i<=a.length-1;i++)
        {
            a[i]=sc.nextInt();
        }
        //converting Array to ArraylIst
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<a.length-1;i++)
        {
            list.add(a[i]);
        }
        System.out.println(list);
        //we want to add element on 3rd index
        System.out.println("Enter value of index");
        int b=sc.nextInt();
        System.out.println("Enter element to be add");
        int c=sc.nextInt();
        list.add(b,c);//syntax= list.add(index,element)
        System.out.println((list));
    }
}
