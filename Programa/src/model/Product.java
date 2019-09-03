/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author aborbon
 */
public class Product implements IPrototype<Product>{
    
    private String code;
    private String name;
    private int price;
    
    public Product() {}

    public Product(String code, String name, int price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    
    
    @Override
    public String toString() {
        return code + "\t" + name + "\t" + price;
    }

    @Override
    public Product clone() {
        return new Product(code, name, price);
    }

    @Override
    public Product deepclone() {
        return this.clone();
    }
    
}
