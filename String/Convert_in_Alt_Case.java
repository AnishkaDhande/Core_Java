public class Convert_in_Alt_Case {
    public static void main(String[] args) {
        String a="Hello World";
        String s2="";
        for(int i=0;i<a.length();i++)
        {
             if(Character.isUpperCase(a.charAt(i)))
             {
                 s2=s2+Character.toLowerCase(a.charAt(i));
             }
             else if(Character.isLowerCase(a.charAt(i)))
             {
                   s2=s2+Character.toUpperCase(a.charAt(i));
             }
             else{
                    s2=s2+a.charAt(i);
             }
        }
        System.out.println("Original String "+a);
        System.out.println("New String "+s2);
    }

}
