/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.LinkedList;

/**
 *
 * @author aborbon
 */
public class ComboBuilder implements IPrototype<ComboBuilder>, IBuilder<Combo>, ICalculable{
    
    private final LinkedList<Product> products;
    private String code;

    public ComboBuilder(String code) {
        this.code = code;
        products = new LinkedList();
    }

    public ComboBuilder(String code, LinkedList<Product> products) {
        this.code = code;
        this.products = products;
    }
    
    public ComboBuilder add(Product product) {
        products.add(product);
        return this;
    }

    public ComboBuilder setCode(String code) {
        this.code = code;
        return this;
    }
    
    public String getName() {
        String response = "";
        for (Product product: products){
            response += product.getName() + "+";
        }
        return response.substring(0, response.length() - 1);
    }
    
    public String getCode() {
        return code;
    }
    
    public boolean isEmpty() {
        return products.isEmpty();
    }
    
    @Override
    public String toString() {
        String response = "Combo:\n";
        for (Product product: products){
            response += product.toString() + "\n";
        }
        response += "Total del combo: " + this.calculate() + "\n";
        return response;
    }

    @Override
    public Combo build() {
        return new Combo(code, products);
    }

    @Override
    public ComboBuilder clone() {
        return new ComboBuilder(code, products);
    }

    @Override
    public ComboBuilder deepclone() {
        ComboBuilder comboClone = new ComboBuilder(code);
        for (Product product : products) {
            comboClone.add(product.deepclone());
        }
        return comboClone;
    }

    @Override
    public int calculate() {
        int precioTotal = 0;
        for (Product product: products){
            precioTotal += product.getPrice();
        }
        return precioTotal;
    }
    
}
