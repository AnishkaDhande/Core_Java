public class Is_Letter {
    public static void main(String[] args) {
        String a="Hello";
        boolean f=true;
        for(int i=0;i<=a.length()-1;i++)
        {
              if(!Character.isLetter(a.charAt(i)))
              {
                //System.out.println()
                f=false;
                break;
              }
        }
        
        if(f==true)
        {
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }
    
}
