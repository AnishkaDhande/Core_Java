import java.util.Scanner;
class Count
{
public static void main(String args[])
{
int n=128065,temp,count=0;
temp=n;
while(n>0)
{
n=n/10;
count++;
}
System.out.println("Number of digits in "+temp+" are "+count);
}
}