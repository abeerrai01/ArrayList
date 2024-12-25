import java.util.*;
public class MissingNumbers
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> obj=new ArrayList<Integer>();
        System.out.println("Enter the number of elements : ");
        int n=in.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the element : "+(i+1));
            obj.add(in.nextInt());
        }
        ArrayList<Integer> obj2=new ArrayList<Integer>();
        for(int i=1;i<=n;i++)
        {
            
            if(!obj.contains(i))
            {
                obj2.add(i);
            }
            

        }
        System.out.println(obj2);
        
        
    }
}