import java.util.*;
class Public 
{
    String name,city;
    int age;
    public Public(String name,String city,int age)
    {
       this.name=name;
       this.age=age;
       this.city=city;
    }
    public String toString()
    {
        return name+" "+age+" "+city;
    }
}
public class PersonFilter
{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        ArrayList<Public> obj=new ArrayList<>();
        System.out.println("Enter the number of People : ");
        int n=in.nextInt();
        in.nextLine();
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter name of Person "+(i+1)+" : ");
            String name=in.nextLine();
            System.out.println("Enter city of Person "+(i+1)+" : ");
            String city=in.nextLine();
            System.out.println("Enter age of Person "+(i+1)+" : ");
            int age=in.nextInt();
            in.nextLine();
            obj.add(new Public(name,city,age));
        }
        while (true) {
            System.out.println("\nFilter Options:");
            System.out.println("1. Filter by City");
            System.out.println("2. Filter by Age");
            System.out.println("3. Show All Products");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = in.nextInt();
            in.nextLine(); // Consume newline
            ArrayList<Public> filteredProducts = new ArrayList<>();

            switch (choice) {
                case 1: // Filter by city
                    System.out.print("Enter city to filter by: ");
                    String category = in.nextLine();
                    for (Public product : obj) {
                        if (product.city.equalsIgnoreCase(category)) {
                            filteredProducts.add(product);
                        }
                    }
                    break;

                case 2: // Filter by age
                    System.out.print("Enter minimum age: ");
                    double minPrice = in.nextDouble();
                    System.out.print("Enter maximum age: ");
                    double maxPrice = in.nextDouble();
                    for (Public product : obj) {
                        if (product.age >= minPrice && product.age <= maxPrice) {
                            filteredProducts.add(product);
                        }
                    }
                    break;

                case 3: // Show all products
                    filteredProducts.addAll(obj);
                    break;

                case 4: // Exit
                    System.out.println("Exiting program.");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Try again.");
                    continue;
            }

            // Display filtered products with pagination
            if (filteredProducts.isEmpty()) {
                System.out.println("No Person found for the given filter.");
            } else {
                displayWithPagination(filteredProducts);
            }
        }
    }

    public static void displayWithPagination(ArrayList<Public> products) {
        Scanner in = new Scanner(System.in);
        int pageSize = 10; // Number of items per page
        int totalPages = (int) Math.ceil((double) products.size() / pageSize);

        int currentPage = 1;

        while (true) {
            System.out.println("\nPage " + currentPage + "/" + totalPages);
            int start = (currentPage - 1) * pageSize;
            int end = Math.min(start + pageSize, products.size());

            for (int i = start; i < end; i++) {
                System.out.println(products.get(i));
            }

            System.out.println("\nOptions:");
            if (currentPage > 1) {
                System.out.println("P: Previous Page");
            }
            if (currentPage < totalPages) {
                System.out.println("N: Next Page");
            }
            System.out.println("E: Exit Pagination");
            System.out.print("Enter your choice: ");
            String choice = in.nextLine().trim().toUpperCase();

            if (choice.equals("N") && currentPage < totalPages) {
                currentPage++;
            } else if (choice.equals("P") && currentPage > 1) {
                currentPage--;
            } else if (choice.equals("E")) {
                break;
            } else {
                System.out.println("Invalid input. Try again.");
            }
        }
        

    }
    
}
