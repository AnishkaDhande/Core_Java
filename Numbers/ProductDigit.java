import java.util.Scanner;
class ProductDigit
{
public static void main(String args[])
{
int n,m=1,rem;
Scanner sc=new Scanner(System.in);
System.out.println("Enter Number ");
n=sc.nextInt();
int temp=n;
while(n>0)
{
rem=n%10;
m=m*rem;
n=n/10;
}
System.out.println("Product of digits of "+temp+" are "+m);
}
}