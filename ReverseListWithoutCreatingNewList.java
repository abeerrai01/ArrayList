import java.util.*;
public class ReverseListWithoutCreatingNewList
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
        System.out.println("Enter the start index (inclusive):");
        int start = in.nextInt();
        System.out.println("Enter the end index (inclusive):");
        int end = in.nextInt();
        if (start < 0 || end >= obj.size() || start > end) {
            System.out.println("Invalid indices for reversal.");
            return;
        }
        else
        {
            while(start<end)
            {
                int temp=obj.get(start);
                obj.set(start,obj.get(end));
                obj.set(end,temp);

                start++;
                end--;
            }
        }
        System.out.println(obj);
    }
}