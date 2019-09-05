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
public class Order implements ICalculable{
    private final LinkedList<Combo> combos;

    public Order() {
        combos = new LinkedList();
    }
    
    public void addCombo(Combo combo) {
        combos.add(combo);
    }
    
    @Override
    public String toString() {
        String response = "Orden:\n\n";
        for (Combo combo: combos){
            response += combo.toString() + "\n";
        }
        response += "Total de la orden: " + this.calculate() + "\n\n";
        return response;
    }
    

    @Override
    public int calculate() {
        int precioTotal = 0;
        for (Combo combo: combos){
            precioTotal += combo.calculate();
        }
        return precioTotal;
    }
}
