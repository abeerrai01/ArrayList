import java.util.*;
public class OddNumbers 
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
        System.out.println(obj);
        Iterator itr=obj.iterator();
        obj.removeIf(n -> n % 2 != 0);
        System.out.println(obj);
    }
}
