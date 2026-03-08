public class Count_non_letter {
    public static void main(String[] args) {
        String a="Hello$Wo4rld";
        int count=0;
        for(int i=0;i<a.length()-1;i++)
        {
            if(!Character.isLetter(a.charAt(i)))
            {
                count++;
             }
       }
       System.out.println(count);
    } 
}
