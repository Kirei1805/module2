package view;

import controller.MainController;
import model.entity.Product;
import model.service.IProductService;
import model.service.ProductService;

import java.util.*;

public class MainView {
    private final Scanner scanner = new Scanner(System.in);
    private final IProductService service = new ProductService();

    public void run() {
        while (true) {
            System.out.println("\n--- Product Management ---");
            System.out.println("1. Add Product");
            System.out.println("2. View All Products");
            System.out.println("3. Find Product by ID");
            System.out.println("4. Update Product");
            System.out.println("5. Delete Product");
            System.out.println("0. Exit");
            System.out.print("Choose: ");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1 -> addProduct();
                case 2 -> viewAll();
                case 3 -> findProduct();
                case 4 -> updateProduct();
                case 5 -> deleteProduct();
                case 0 -> System.exit(0);
                default -> System.out.println("Invalid choice.");
            }
        }
    }

    private void addProduct() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter price: ");
        double price = Double.parseDouble(scanner.nextLine());
        service.addProduct(name, price);
        System.out.println("Product added.");
    }

    private void viewAll() {
        List<Product> list = service.listProducts();
        if (list.isEmpty()) {
            System.out.println("No products available.");
        } else {
            list.forEach(System.out::println);
        }
    }

    private void findProduct() {
        System.out.print("Enter product ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        Product p = service.findById(id);
        System.out.println(p != null ? p : "Not found.");
    }

    private void updateProduct() {
        System.out.print("Enter ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter new name: ");
        String name = scanner.nextLine();
        System.out.print("Enter new price: ");
        double price = Double.parseDouble(scanner.nextLine());
        boolean updated = service.updateProduct(id, name, price);
        System.out.println(updated ? "Updated successfully." : "Update failed.");
    }

    private void deleteProduct() {
        System.out.print("Enter ID to delete: ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean deleted = service.deleteProduct(id);
        System.out.println(deleted ? "Deleted successfully." : "Delete failed.");
    }

    public static void main(String[] args) {
        new MainView().run();
    }
}

