/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author aborbon
 * @param <T>
 */
public interface IPrototypeFactory<T> {
    public T get(String name);
    public void add(String name, T prototype);
}
