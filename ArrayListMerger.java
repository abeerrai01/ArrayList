import java.util.*;
public class ArrayListMerger
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
        ArrayList<Integer> obj3=new ArrayList<Integer>();
        for(int i : obj)
        {
            obj3.add(i);
        }
        for(int i : obj2)
        {
            obj3.add(i);
        }
        System.out.println(obj3);
        HashSet<Integer> obj4=new HashSet<Integer>(obj3);
        ArrayList<Integer> obj5=new ArrayList<Integer>(obj4);
        System.out.println(obj5);
        
}
}
