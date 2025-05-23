package product;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
public class ProductManager {
    private ArrayList<Product> products = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void showMenu() {
        System.out.println("\n----- Quản lý sản phẩm ----- ");
        System.out.println("1. Thêm sản phẩm");
        System.out.println("2. Hiển thị danh sách sản phẩm");
        System.out.println("3. Cập nhật sản phẩm");
        System.out.println("4. Xóa sản phẩm");
        System.out.println("5. Thoát");
        System.out.print("Chọn chức năng: ");
    }

    public void addProduct() {
        System.out.print("Nhập ID sản phẩm: ");
        int id = Integer.parseInt(scanner.nextLine());

        for (Product p : products) {
            if (p.getId() == id) {
                System.out.println("ID đã tồn tại.Mời nhập lại.");
                return;
            }
        }

        System.out.print("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();

        System.out.print("Nhập giá sản phẩm: ");
        double price = Double.parseDouble(scanner.nextLine());

        products.add(new Product(id, name, price));
        System.out.println("Thêm sản phẩm thành công!");
    }

    public void displayProducts() {
        if (products.isEmpty()) {
            System.out.println("Danh sách sản phẩm trống.");
            return;
        }
        System.out.println("\nDanh sách sản phẩm:");
        for (Product p : products) {
            System.out.println(p);
        }
    }

    public void updateProduct() {
        System.out.print("Nhập ID sản phẩm cần cập nhật: ");
        int id = Integer.parseInt(scanner.nextLine());

        Product productToUpdate = null;
        for (Product p : products) {
            if (p.getId() == id) {
                productToUpdate = p;
                break;
            }
        }

        if (productToUpdate == null) {
            System.out.println("Không tìm thấy sản phẩm với ID trên.");
            return;
        }

        System.out.print("Nhập tên mới (để trống nếu không thay đổi): ");
        String newName = scanner.nextLine();
        if (!newName.trim().isEmpty()) {
            productToUpdate.setName(newName);
        }

        System.out.print("Nhập giá mới (để trống nếu không thay đổi): ");
        String priceInput = scanner.nextLine();
        if (!priceInput.trim().isEmpty()) {
            try {
                double newPrice = Double.parseDouble(priceInput);
                productToUpdate.setPrice(newPrice);
            } catch (NumberFormatException e) {
                System.out.println("Giá nhập không hợp lệ, không cập nhật giá.");
            }
        }

        System.out.println("Cập nhật sản phẩm thành công!");
    }

    public void deleteProduct() {
        System.out.print("Nhập ID sản phẩm cần xóa: ");
        int id = Integer.parseInt(scanner.nextLine());

        Product productToDelete = null;
        for (Product p : products) {
            if (p.getId() == id) {
                productToDelete = p;
                break;
            }
        }

        if (productToDelete == null) {
            System.out.println("Không tìm thấy sản phẩm với ID trên.");
            return;
        }

        products.remove(productToDelete);
        System.out.println("Xóa sản phẩm thành công!");
    }
}
