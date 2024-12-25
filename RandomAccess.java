import java.util.*;
public class RandomAccess
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
       System.out.println(obj);
       int max = n-1;
        int min = 1;
        int range = max - min + 1;
       System.out.println("Random Element = "+obj.get((int)(Math.random() * range)+min));
    }
}