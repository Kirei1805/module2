package controller;
import model.entity.Product;
import model.service.IProductService;
import model.service.ProductService;

import java.util.List;

public class MainController {
    private final IProductService service = new ProductService();

    public void add(String name, double price) {
        service.addProduct(name, price);
    }

    public void showAll() {
        service.listProducts().forEach(System.out::println);
    }

    public Product getById(int id) {
        return service.findById(id);
    }

    public boolean update(int id, String name, double price) {
        return service.updateProduct(id, name, price);
    }

    public boolean delete(int id) {
        return service.deleteProduct(id);
    }
}

