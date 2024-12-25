import java.util.*;
public class RotateListForNTimes
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
        System.out.println("Enter the number of times you want to rotate the list");
        int k=in.nextInt();
        
            Collections.rotate(obj, k);
            

       System.out.println(obj);
    }
}