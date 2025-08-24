import java.util.Scanner;
public class Number2 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter Number :");
        int a=sc.nextInt();
        int sum=0;

        if(a>=10000 && a<100000)      //76354
        {
             int v=a%10;        //4
             int w=a/10%10;     //5
             int x=a/100%10;     //3
             int y=a/1000%10;     //6
             int z=a/10000;         //7
             sum=x+y+z+w+v;
             System.out.println(sum);

        }
        else
        {
             System.out.println("Invalid Input");
        }
    }
    
}
