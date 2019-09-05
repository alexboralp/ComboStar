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
public class Combo implements ICalculable{
    
    private final LinkedList<Product> products;
    private String code;

    public Combo() {
        products = new LinkedList();
    }

    public Combo(String code, LinkedList<Product> products) {
        this.code = code;
        this.products = products;
    }
    
    public void addProduct(Product product) {
        products.add(product);
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

    public void setCode(String code) {
        this.code = code;
    }
    
    @Override
    public String toString() {
        String response = "Combo:\n";
        for (Product product: products){
            response += product.toString() + "\n";
        }
        response += this.calculate() + "\n";
        return response;
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
