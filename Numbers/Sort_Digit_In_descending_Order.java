import java.util.Arrays;
public class Sort_Digit_In_descending_Order {
    public static void main(String args[])
    {
        int a=5293;

        //step 1- convert Integer to String

        String s= String.valueOf(a);

        //step 2- convert String to Array

        char c[] =s.toCharArray();

        //step 3-Sort in ascending order

        Arrays.sort(c);
        System.out.println(c);

        //step 4- convert array to String

        String p=new String(c);

        //convert String to Integer

         int b=Integer.parseInt(p);
        
          int rev=0;
        while(b>0)
        {
            int rem=b%10;
            rev=rev*10+rem;
            b=b/10;
        }
        System.out.println(rev);


    }
    
}
