import java.util.*;
public class OccurenceCounter 
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
        ArrayList<Integer> visited = new ArrayList<>();
        System.out.println("Frequency Count:");
        for (int i = 0; i < obj.size(); i++) {
            int count = 0;
            int current = obj.get(i);

            // Skip if the element is already counted
            if (!visited.contains(current)) {
                for (int j = 0; j < obj.size(); j++) {
                    if (obj.get(j) == current) {
                        count++;
                    }
                }
                visited.add(current); // Mark the element as visited
                System.out.println(current + ": " + count);
            }
        }
}
}
