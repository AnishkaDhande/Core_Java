public class Count_Consonent_Vowel {

    public static void main(String[] args) {
        String a="Hello   Anishka";
        char ch;
        int vcount=0;
        int c_count=0;
        for(int i=0;i<=a.length()-1;i++)
        {   ch= a.charAt(i);
            if(a.charAt(i)=='a'||a.charAt(i)=='A'||a.charAt(i)=='e'||a.charAt(i)=='E'||a.charAt(i)=='i'||a.charAt(i)=='I'||a.charAt(i)=='o'||a.charAt(i)=='O'||a.charAt(i)=='u'||a.charAt(i)=='U')
         {
           vcount++;
           
        }
        else 
            {
                if(a.charAt(i)==' ')
                {
                    continue;
                }
                c_count++;
         }
    }
    System.out.println(vcount);
    System.out.println(c_count);
}
}