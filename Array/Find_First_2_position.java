//Write a program to find first two element in array
import java.util.Scanner;
public class Find_First_2_position {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    boolean found=false;
    System.out.println("Enter Size of an Array");
    int n=sc.nextInt();
    int a[]=new int[n];
    System.out.println("Enter "+n+" elements in Array");
    for(int i=0;i<=a.length-1;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter Element to be search");
        int s=sc.nextInt();
          int count=0;
          int i;
        for(i=0;i<=a.length-1;i++)
        {         if(s==a[i])
            {     
            found=true; 
            System.out.println("Position of element is "+(i+1));           
            if(count==2)
                {
            break;
                }
        }
    }
          if(found==false)
            {
                System.out.println(" Element Not Found");
            }      


    
}
 }