import java.util.Scanner;
import java.util.Arrays;
public class DigitSort {
    public static void main(String args[])
    {
           int a  =5492;

           //Step 1- Convert integre to string

           String c=String.valueOf(a); 
           
           //step 2- convert String to array
              
           char b[]=c.toCharArray();

           //step3 -sort the array
              Arrays.sort(b);
             /*  System.out.println(b);*/

          //    Step  -This steps are fully optional

             //Convert Array to String
               
            /*  String s=b.toString();     OR Below Method*/
            String s=new String(b);

            //Convert String to integer

            int p=Integer.parseInt(s);
            System.out.println(p);




    }
    
    
}
