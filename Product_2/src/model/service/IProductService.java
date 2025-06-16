package model.service;

import model.entity.Product;

import java.util.List;

public interface IProductService {
    void addProduct(String name, double price);
    List<Product> listProducts();
    Product findById(int id);
    boolean updateProduct(int id, String name, double price);
    boolean deleteProduct(int id);
}
