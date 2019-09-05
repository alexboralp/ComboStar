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
public class ComboBuilderFactory implements IPrototypeFactory<ComboBuilder>{
    private final HashMap<String, ComboBuilder> combos;

    public ComboBuilderFactory() {
        combos = new HashMap();
    }

    @Override
    public ComboBuilder get(String name) {
        return combos.get(name);
    }

    @Override
    public void add(String name, ComboBuilder prototype) {
        combos.put(name, prototype);
    }
}
