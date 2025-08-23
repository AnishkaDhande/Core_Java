import java.util.Scanner;
class CountEvenOdd
{
public static void main(String args[])
{
int n=129067,EvenDigit=0,OddDigit=0,rem;
int temp=n;
while(n>0)
{
rem=n%10;
if(rem%2==0)
{
EvenDigit++;
}
else
{
OddDigit++;
}
n=n/10;
}
System.out.println("Number of Even Digits in "+temp+" are "+EvenDigit);
System.out.println("Number of Odd Digits in "+temp+" are "+OddDigit);
}
}

