import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

class Employee implements java.io.Serializable {
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

public class SerialAndDeserial {
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
        try{
        FileOutputStream fos=new FileOutputStream("EmployeeSalary.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(obj);
        oos.close();
        fos.close();
        System.out.println("Object Serialized");
        }
        catch(Exception e){
            System.out.println(e);
        }
        try (FileInputStream fis = new FileInputStream("EmployeeSalary.txt");
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            // Deserialize the object
            ArrayList<Employee> obj2 = (ArrayList<Employee>) ois.readObject();

            // Print the deserialized object
            System.out.println("Deserialized Employee List:");
            for (Employee e : obj2) {
                System.out.println(e);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO Exception: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}

    
