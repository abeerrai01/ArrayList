import java.util.*;
class Product
{
    String name,category;
    double price;
    public Product(String name,String category,double price)
    {
        this.name=name;
        this.category=category;
        this.price=price;
    }
    public String toString()
    {
        return name+" "+category+" "+price;
    }
}
public class Category 
{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        ArrayList<Product> obj=new ArrayList<>();
        System.out.println("Enter the number of products : ");
        int n=in.nextInt();
        in.nextLine();
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter name of product "+(i+1)+" : ");
            String name=in.nextLine();
            System.out.println("Enter category of product "+(i+1)+" : ");
            String category=in.nextLine();
            System.out.println("Enter price of product "+(i+1)+" : ");
            double price=in.nextDouble();
            in.nextLine();
            obj.add(new Product(name,category,price));
        }
        while (true) {
            System.out.println("\nFilter Options:");
            System.out.println("1. Filter by Category");
            System.out.println("2. Filter by Price Range");
            System.out.println("3. Show All Products");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = in.nextInt();
            in.nextLine(); // Consume newline
            ArrayList<Product> filteredProducts = new ArrayList<>();

            switch (choice) {
                case 1: // Filter by category
                    System.out.print("Enter category to filter by: ");
                    String category = in.nextLine();
                    for (Product product : obj) {
                        if (product.category.equalsIgnoreCase(category)) {
                            filteredProducts.add(product);
                        }
                    }
                    break;

                case 2: // Filter by price range
                    System.out.print("Enter minimum price: ");
                    double minPrice = in.nextDouble();
                    System.out.print("Enter maximum price: ");
                    double maxPrice = in.nextDouble();
                    for (Product product : obj) {
                        if (product.price >= minPrice && product.price <= maxPrice) {
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
                System.out.println("No products found for the given filter.");
            } else {
                displayWithPagination(filteredProducts);
            }
        }
    }

    public static void displayWithPagination(ArrayList<Product> products) {
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
