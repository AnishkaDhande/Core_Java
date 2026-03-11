//Write a program to find position of element in array

import java.util.Scanner;;
class Element_position{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean found=false;
        System.out.println("Enter number of elements in Array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter "+n+ " elements");
        for(int i=0;i<=a.length-1;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter element to find");
        int c=sc.nextInt();
        
        for(int i=0;i<=a.length-1;i++)
        {
            if(a[i]==c)
            {
                System.out.println("Position of element is "+(i+1));
                found=true;
                break;
            }
        }
        
       if(found==false)
       {
        System.out.println("Element not Found");
       }
    }
}