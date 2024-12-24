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
public class ArraySublist 
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
        ArrayList<Student> obj2 = new ArrayList<>(obj.subList(3, n));
        System.out.println(obj2);
    }
}
