package model.repositorry;

import model.entity.Product;

import java.util.*;

public class ProductRepository {
//  private final List<Product> productList = new ArrayList<>();
    private final List<Product> productList = new LinkedList<>();
    private int nextId = 1;

    public List<Product> getAll() {
        return new ArrayList<>(productList);
    }

    public Product getById(int id) {
        return productList.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }

    public void add(Product product) {
        product.setId(nextId++);
        productList.add(product);
    }

    public boolean update(Product product) {
        Product existing = getById(product.getId());
        if (existing != null) {
            existing.setName(product.getName());
            existing.setPrice(product.getPrice());
            return true;
        }
        return false;
    }

    public boolean delete(int id) {
        return productList.removeIf(p -> p.getId() == id);
    }
}