package product;

public class Main {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        int choice;
        do {
            manager.showMenu();
            choice = Integer.parseInt(manager.scanner.nextLine());
            switch (choice) {
                case 1: manager.addProduct(); break;
                case 2: manager.displayProducts(); break;
                case 3: manager.updateProduct(); break;
                case 4: manager.deleteProduct(); break;
                case 5: System.out.println("Thoát chương trình."); break;
                default: System.out.println("Lựa chọn không hợp lệ, vui lòng thử lại.");
            }
        } while (choice != 5);
    }
}
