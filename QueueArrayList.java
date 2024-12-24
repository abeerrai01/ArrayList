import java.util.*;
class Queue
{
    int front=-1,rear=-1;
    

  Scanner in=new Scanner(System.in);
  ArrayList<Integer> obj=new ArrayList<Integer>(); 
  public void Enqueue(int x)
  {
        if(obj.isEmpty())
        {
            obj.add(x);
            front++;
            rear++;
            System.out.println("ELEMENT PUSHED IN Queue : "+x);
        }
        else
        {
            obj.add(x);
            rear++;
            System.out.println("ELEMENT PUSHED IN Queue : "+x);   
        }
            }
  public void Dequeue()
  {
    if(obj.isEmpty())
    {
        System.out.println("Queue underflow");
    }
    else if(front==rear)
    {
        int y=obj.remove(rear);
        front--;
        rear--;
        System.out.println("ELEMENT POPPED FROM Queue : "+y);
    }
    else
    {
        int y=obj.remove(rear);
        rear--;
        System.out.println("ELEMENT POPPED FROM STACK : "+y);
    }
  }
  public void peek()
  {
    if(obj.isEmpty())
    {
        System.out.println("Queue underflow");
    }
    else if(front==rear)
    {
        System.out.println("TOP ELEMENT FROM Queue : "+obj.get(front));
    }
    else
    {
        System.out.println("Top element is "+obj.get(rear));
    }
  }
  public void display()
  {
    if(obj.isEmpty())
    {
        System.out.println("Queue underflow");
    }
    else
    {
        for(int i=rear;i>=front;i--)
        {
            System.out.println(obj.get(i));
        }
    }
  }
}
public class StackArrayList
 {
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        Queue obj=new Queue();
        boolean flag=true;
        while(flag)
        {
        System.out.println("Enter Your Choice : \n 1 : Push \n 2 : Pop \n 3 : Peek \n 4 : Display \n 5 : Exit \n");
        int ch=in.nextInt();
        switch (ch) {
            case 1:
                System.out.println("Enter Element : ");
                int x=in.nextInt();
                obj.Enqueue(x);
                break;
            case 2:
                obj.Dequeue();
                break;
            case 3:
                obj.peek();
                break;
            case 4:
                obj.display();
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("wrong choice");
                break;
        }
        System.out.println("Do you want to continue : \n 1 : Yes \n 2 : No \n");
        int x=in.nextInt();
        if(x==1)
         {
            flag=true;
         }
         else
         {
            flag=false;
         }
    }
    
}
 }
