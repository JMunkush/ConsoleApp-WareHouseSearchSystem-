package io.munkush.app.service;

import io.munkush.app.entity.Product;

import java.util.List;

public interface ProductService {

    Product getById(int id);

    List<Product> getProductsByCategory(String category);

    Product getByName(String name);

    List<Product> getAll();
}
