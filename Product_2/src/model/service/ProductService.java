package model.service;

import model.entity.Product;
import model.repositorry.ProductRepository;

import java.util.List;

public class ProductService implements IProductService {
    private final ProductRepository repo = new ProductRepository();

    @Override
    public void addProduct(String name, double price) {
        repo.add(new Product(0, name, price));
    }

    @Override
    public List<Product> listProducts() {
        return repo.getAll();
    }

    @Override
    public Product findById(int id) {
        return repo.getById(id);
    }

    @Override
    public boolean updateProduct(int id, String name, double price) {
        return repo.update(new Product(id, name, price));
    }

    @Override
    public boolean deleteProduct(int id) {
        return repo.delete(id);
    }
}

