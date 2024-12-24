import java.util.*;
public class MediumPagination
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> obj=new ArrayList<Integer>();
        for(int i=0;i<10;i++)
        {
            System.out.println("Enter the element : "+(i+1));
            obj.add(in.nextInt());
        }
        int pageitem=2;
        double totalpages=10/pageitem;
        totalpages=Math.ceil(totalpages);
        int start=0,last=pageitem;
        for(int i=0;i<totalpages;i++)
        {
            System.out.println("Page "+(i+1));
            
            for(int j=0;j<pageitem;j++)
            {
                System.out.print(obj.get(start)+" ");
                start++;
            }
            System.out.println();
            
        }
        
    }
}