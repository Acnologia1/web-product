package com.codegym.service;

import com.codegym.model.Product;

import java.beans.Customizer;
import java.util.List;

public interface ProductService {
    List<Product> fillAdd();
    void save(Product product);
    Product findById(int id);
    void update(int id,Product product);
    void remove(int id);
    Product findByName(String name);
}
