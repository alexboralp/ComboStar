/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.HashMap;

/**
 *
 * @author aborbon
 */
public class ProductFactory implements IPrototypeFactory<Product>{
    
    private final HashMap<String, Product> products;

    public ProductFactory() {
        products = new HashMap();
    }
    
    public static Product createNewProduct(String code, String name, int price) {
        return new Product(code, name, price);
    }

    @Override
    public Product get(String name) {
        return products.get(name).clone();
    }

    @Override
    public void add(String name, Product prototype) {
        products.put(name, prototype);
    }
    
}
