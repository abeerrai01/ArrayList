import java.util.*;
public class immutableList
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
        List<Integer> immutableList=Collections.unmodifiableList(obj);
        System.out.println("Enter the element to de added :");
        int x=in.nextInt();
        try
        {
            immutableList.add(x);
        }
        catch(Exception e)
        {
             System.out.println("Error");
        }
        System.out.println("Enter the element to de deleted :");
        int y=in.nextInt();
        try
        {
            immutableList.remove(y);
        }
        catch(Exception e)
        {
             System.out.println("Error");
        }
        System.out.println(immutableList);
        
        
    }
}