import java.util.Scanner;
class sum_elements{
    public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            int sum=0;
            System.out.println("Enter size of an Array");
            int n=sc.nextInt();
               int a[]=new int[n];
               System.out.println("Enter "+n+" Elements");
            for(int i=0;i<=a.length-1;i++)
            {
                a[i]=sc.nextInt();
            }
            System.out.println("Elements of Array are ");
            for(int i=0;i<=a.length-1;i++)
            {
                System.out.println(a[i]);
            }

            for(int i=0;i<=a.length-1;i++)
            {
                 sum=sum+a[i];
            }
System.out.println("Sum of All Elements of Array is "+sum);

        }
    

}