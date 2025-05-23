package product;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
public class ProductManager {
    private ArrayList<Product> products = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void showMenu() {
        System.out.println("\n----- Manage Products ----- ");
        System.out.println("1. Add product");
        System.out.println("2. Display product");
        System.out.println("3. Update product");
        System.out.println("4. Delete product");
        System.out.println("5. Exit");
        System.out.print(" Enter your Choice : ");
    }

    public void addProduct() {
        System.out.print("Enter product ID : ");
        int id = Integer.parseInt(scanner.nextLine());

        for (Product p : products) {
            if (p.getId() == id) {
                System.out.println("ID Exist in your product list.");
                return;
            }
        }

        System.out.print("Enter product name : ");
        String name = scanner.nextLine();

        System.out.print("Enter product price : ");
        double price = Double.parseDouble(scanner.nextLine());

        products.add(new Product(id, name, price));
        System.out.println("Successfully added product.!");
    }

    public void displayProducts() {
        if (products.isEmpty()) {
            System.out.println("List is empty.");
            return;
        }
        System.out.println("\nList of products :");
        for (Product p : products) {
            System.out.println(p);
        }
    }

    public void updateProduct() {
        System.out.print("Enter product ID need to be updated : ");
        int id = Integer.parseInt(scanner.nextLine());

        Product productToUpdate = null;
        for (Product p : products) {
            if (p.getId() == id) {
                productToUpdate = p;
                break;
            }
        }

        if (productToUpdate == null) {
            System.out.println("Don't exist in your product list.");
            return;
        }

        System.out.print("Enter new product name : ");
        String newName = scanner.nextLine();
        if (!newName.trim().isEmpty()) {
            productToUpdate.setName(newName);
        }

        System.out.print("Enter new product price : ");
        String priceInput = scanner.nextLine();
        if (!priceInput.trim().isEmpty()) {
            try {
                double newPrice = Double.parseDouble(priceInput);
                productToUpdate.setPrice(newPrice);
            } catch (NumberFormatException e) {
                System.out.println("Price is not suitable.");
            }
        }

        System.out.println("Updated success product : !");
    }

    public void deleteProduct() {
        System.out.print("Enter ID need to be deleted : ");
        int id = Integer.parseInt(scanner.nextLine());

        Product productToDelete = null;
        for (Product p : products) {
            if (p.getId() == id) {
                productToDelete = p;
                break;
            }
        }

        if (productToDelete == null) {
            System.out.println("Can't find product with ID .");
            return;
        }

            products.remove(productToDelete);
        System.out.println("Deleted success product : !");
    }
}

