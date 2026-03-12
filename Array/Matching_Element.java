//find common elements between array
public class Matching_Element {
    public static void main(String[] args) {
        boolean found=false;
        int a[]={12,5,3,4,9};
        int b[]={23,57,41,16,14};
        for(int i=0;i<=a.length-1;i++)
        {
            for(int j=0;j<=a.length-1;j++)
            {
                if(a[i]==b[j])
                    {
                        found=true;
                      System.out.println("Matching element is "+a[i]);
                       }     
           }
        }
        if(found==false)
        {
            System.out.println("There is No matching element");
        }
    }  
}
