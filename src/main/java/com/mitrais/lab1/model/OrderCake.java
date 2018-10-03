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
public class OrderCake extends Cake{

    private double weight;

    public OrderCake(String name, double rate, double weight) {
        super(name, rate);
        setWeight(weight);
        //this.weight = weight;
    }
    
    public double getWeight(){
        return weight;
    }

    public double calcPrice() {
        return rate * weight;
    }

    private void setWeight(double newWeight) {
        if (newWeight >= 0.0) {
            weight = newWeight;
        }
    }
}
