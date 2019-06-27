package com.codegym.service;

import com.codegym.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ProductServiceImpl implements ProductService{
    private static Map<Integer, Product> products;
    static {
        products = new HashMap<>();

        products.put(1,new Product(1, "Tivi_samsung", 20000, "25inch", "Hanoi","Sach1.JPG"));
        products.put(2,new Product(2, "Tivi_sony", 22000, "26inch", "Hanam","Sach2.JPG"));
        products.put(3,new Product(3, "Tivi_LG", 23000, "27inch", "Hatien","Sach3.JPG"));
        products.put(4,new Product(4, "Tivi_led", 26000, "28inch", "Hatrung","test.JPG"));
        products.put(5,new Product(5, "Tivi_abc", 29000, "29inch", "Hamai","Sach2.JPG"));
    }

    @Override
    public List<Product> fillAdd() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }


    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id,product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }
    @Override
    public Product findByName(String name){
        //xu ly tim kiem
        List<Product> list = new ArrayList<>(products.values());
        for (Product product: list){
            if( product.getName().equals(name))
            return product;
        }
        return null;
    }
}
