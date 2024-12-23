import java.util.*;
class Student {
    String name;
    int id;
    char grade;

    public Student(String name, int id, char grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    public String toString() {
        return name + " " + id + " " + grade;
    }
}
public class check 
{
    public static void main(String[] args) 
    {
     Scanner in = new Scanner(System.in);
     ArrayList<Student> obj = new ArrayList<>();

        // Input Students
        System.out.println("Enter the number of students:");
        int n = in.nextInt();
        in.nextLine(); // Consume newline
        for (int i = 0; i < n; i++) {
            System.out.println("Enter name of student " + (i + 1) + ":");
            String name = in.nextLine();
            System.out.println("Enter ID of student " + (i + 1) + ":");
            int id = in.nextInt();
            System.out.println("Enter Grade of student " + (i + 1) + ":");
            char grade = in.next().charAt(0);
            in.nextLine(); // Consume newline
            obj.add(new Student(name, id, grade));
        }
        int count=0;
       System.out.println("Enter the name of the student to search for:");
       String name=in.nextLine();
       Iterator itr=obj.iterator();
       while(itr.hasNext())
       {
        Student s=(Student)itr.next();
        if(s.name.equals(name))
        {
            System.out.println(s);
            count++;
        }
       
       }  
       if(count==0)
       {
           System.out.println("student not found");
       }
       count=0;
       System.out.println("Enter the ID of the student to search for:");
       int id=in.nextInt();
       Iterator itr2=obj.iterator();
       while(itr2.hasNext())
       {
        Student s=(Student)itr2.next();
        if(s.id==id)
        {
            System.out.println(s);
            count++;
        }
       }
       if(count==0)
       {
           System.out.println("student not found");
       } 
       count=0;
       System.out.println("Enter the Grade of the student to search for:");
       char grade=in.next().charAt(0);
       Iterator itr3=obj.iterator();
       while(itr3.hasNext())
       {
        Student s=(Student)itr3.next();
        if(s.grade==grade)
        {
            System.out.println(s);
            count++;
        }
        
       } 
       if(count==0)
       {
           System.out.println("student not found");
       }
    }
}
