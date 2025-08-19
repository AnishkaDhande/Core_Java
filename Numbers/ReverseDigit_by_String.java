import java.util.Scanner;
public class ReverseDigit_by_String {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a=sc.nextInt();
        String c=String.valueOf(a);
        StringBuilder  sb=new StringBuilder(c);
        sb.reverse();
        System.out.println(sb);
        

    }
    
}
