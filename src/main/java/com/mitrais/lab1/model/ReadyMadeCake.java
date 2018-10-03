/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mitrais.lab1.model;

/**
 *
 * @author Arum_M664
 */
public class ReadyMadeCake extends Cake {

    private int quantity;

    public ReadyMadeCake(String name, double rate, int quantity) {
        super(name, rate);
        setQuantity(quantity);
    }

    @Override
    public double calcPrice() {
        return rate * quantity;
    }

    private void setQuantity(int newQuantity) {
        if (newQuantity >= 0.0) {
            quantity = newQuantity;
        }
    }

}
