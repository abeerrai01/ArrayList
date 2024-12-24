import java.util.*;
public class CommonElements 
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> obj=new ArrayList<Integer>();
        System.out.println("Enter the number of elements:");
        int l=in.nextInt();
        for(int i=0;i<l;i++)
        {
            System.out.println("Enter the element : "+(i+1));
            obj.add(in.nextInt());
        }
        ArrayList<Integer> obj2=new ArrayList<Integer>();
        System.out.println("Enter the number of elements:");
        int n=in.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the element : "+(i+1));
            obj2.add(in.nextInt());
        }
        obj.retainAll(obj2);
        System.out.println(obj);
        
        
}
}
