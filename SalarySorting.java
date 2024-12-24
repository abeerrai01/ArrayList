import java.util.*;

class Employee {
    String name;
    double Salary;
   

    public Employee(String name, double Salary) {
        this.name = name;
        this.Salary = Salary;
    }

    public String toString() {
        return name + " " + Salary ;
    }
}

public class SalarySorting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Employee> obj = new ArrayList<>();

        // Input Students
        System.out.println("Enter the number of Employee:");
        int n = in.nextInt();
        in.nextLine(); // Consume newline
        for (int i = 0; i < n; i++) {
            System.out.println("Enter name of Employee " + (i + 1) + ":");
            String name = in.nextLine();
            System.out.println("Enter Salary of Employee " + (i + 1) + ":");
            double Salary = in.nextDouble();
            in.nextLine();
            obj.add(new Employee(name, Salary));
        }
        System.out.println(obj);
        Collections.sort(obj,(s1,s2)->Double.compare(s1.Salary, s2.Salary));
        Collections.reverse(obj);
        System.out.println(obj);

    }
}