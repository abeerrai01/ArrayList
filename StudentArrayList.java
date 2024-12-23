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

public class merge {
    public static void main(String[] args) {
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

        // Menu for Operations
        String choice = "yes";
        while (choice.equalsIgnoreCase("yes")) {
            System.out.println("\nCHOOSE FROM MENU TO PERFORM OPERATIONS:");
            System.out.println("1 : Delete");
            System.out.println("2 : Retrieve");
            System.out.println("3 : Update");
            System.out.print("Enter your choice: ");
            int ch = in.nextInt();
            in.nextLine(); // Consume newline

            if (ch == 1) { // Delete
                System.out.println("Do you want to delete a student by Name or ID?");
                String ans2 = in.nextLine().toLowerCase();

                if (ans2.equals("name")) { // Delete by Name
                    System.out.println("Enter the name of the student to be deleted:");
                    String name = in.nextLine();
                    boolean found = false;
                    Iterator<Student> itr = obj.iterator();
                    while (itr.hasNext()) {
                        Student s = itr.next();
                        if (s.name.equalsIgnoreCase(name)) {
                            itr.remove();
                            found = true;
                            break;
                        }
                    }
                    if (found) {
                        System.out.println("Student with name '" + name + "' has been deleted.");
                    } else {
                        System.out.println("No student found with the name: " + name);
                    }
                } else if (ans2.equals("id")) { // Delete by ID
                    System.out.println("Enter the ID of the student to be deleted:");
                    int id = in.nextInt();
                    in.nextLine(); // Consume newline
                    boolean found = false;
                    Iterator<Student> itr = obj.iterator();
                    while (itr.hasNext()) {
                        Student s = itr.next();
                        if (s.id == id) {
                            itr.remove();
                            found = true;
                            break;
                        }
                    }
                    if (found) {
                        System.out.println("Student with ID '" + id + "' has been deleted.");
                    } else {
                        System.out.println("No student found with the ID: " + id);
                    }
                } else {
                    System.out.println("Invalid choice. Please enter 'Name' or 'ID'.");
                }
            } else if (ch == 2) { // Retrieve
                System.out.println("Do you want to retrieve a student by Name or ID?");
                String ans3 = in.nextLine().toLowerCase();

                if (ans3.equals("name")) { // Retrieve by Name
                    System.out.println("Enter the name of the student to be retrieved:");
                    String name = in.nextLine();
                    boolean found = false;
                    for (Student s : obj) {
                        if (s.name.equalsIgnoreCase(name)) {
                            System.out.println("Student details: " + s);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("No student found with the name: " + name);
                    }
                } else if (ans3.equals("id")) { // Retrieve by ID
                    System.out.println("Enter the ID of the student to be retrieved:");
                    int id = in.nextInt();
                    in.nextLine(); // Consume newline
                    boolean found = false;
                    for (Student s : obj) {
                        if (s.id == id) {
                            System.out.println("Student details: " + s);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("No student found with the ID: " + id);
                    }
                } else {
                    System.out.println("Invalid choice. Please enter 'Name' or 'ID'.");
                }
            }
            else if (ch == 3) // Update
{
    System.out.println("Do you want to update a student by Name or ID?");
    String ans4 = in.nextLine().toLowerCase();

    if (ans4.equals("name")) {
        System.out.println("Enter the name of the student to be updated:");
        String name = in.nextLine();
        boolean found = false;

        for (Student s : obj) {
            if (s.name.equalsIgnoreCase(name)) {
                System.out.println("WHAT DO YOU WANT TO UPDATE \n 1 : NAME \n 2 : ID \n 3 : GRADE");
                int ch1 = in.nextInt();
                in.nextLine(); // Consume newline

                switch (ch1) {
                    case 1:
                        System.out.println("Enter the new name:");
                        s.name = in.nextLine();
                        System.out.println("Name updated successfully.");
                        break;
                    case 2:
                        System.out.println("Enter the new ID:");
                        s.id = in.nextInt();
                        in.nextLine(); // Consume newline
                        System.out.println("ID updated successfully.");
                        break;
                    case 3:
                        System.out.println("Enter the new grade:");
                        s.grade = in.next().charAt(0);
                        in.nextLine(); // Consume newline
                        System.out.println("Grade updated successfully.");
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No student found with the name: " + name);
        }
    } else if (ans4.equals("id")) {
        System.out.println("Enter the ID of the student to be updated:");
        int id = in.nextInt();
        in.nextLine(); // Consume newline
        boolean found = false;

        for (Student s : obj) {
            if (s.id == id) {
                System.out.println("WHAT DO YOU WANT TO UPDATE \n 1 : NAME \n 2 : ID \n 3 : GRADE");
                int ch1 = in.nextInt();
                in.nextLine(); // Consume newline

                switch (ch1) {
                    case 1:
                        System.out.println("Enter the new name:");
                        s.name = in.nextLine();
                        System.out.println("Name updated successfully.");
                        break;
                    case 2:
                        System.out.println("Enter the new ID:");
                        s.id = in.nextInt();
                        in.nextLine(); // Consume newline
                        System.out.println("ID updated successfully.");
                        break;
                    case 3:
                        System.out.println("Enter the new grade:");
                        s.grade = in.next().charAt(0);
                        in.nextLine(); // Consume newline
                        System.out.println("Grade updated successfully.");
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No student found with the ID: " + id);
        }
    } else {
        System.out.println("Invalid option. Please choose either 'name' or 'id'.");
    }
}

            else {
                System.out.println("Invalid choice. Please select 1 (Delete) or 2 (Retrieve).");
            }

            // Ask if the user wants to continue
            System.out.println("Do you want to continue? (yes/no)");
            choice = in.nextLine();
        }

        System.out.println("\nRemaining Student Details:");
        for (Student s : obj) {
            System.out.println(s);
        }
    }
}
