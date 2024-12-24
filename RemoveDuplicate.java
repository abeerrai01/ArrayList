import java.util.*;
public class RemoveDuplicate
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
        for(int i=0;i<obj.size();i++)
        {
            
                for(int j=i+1;j<obj.size();j++)
                {
                    if(obj.get(i)==obj.get(j))
                    {
                       obj.remove(j);
                       j--;
                    }
                }
        }
        System.out.println(obj);
        
    }
}