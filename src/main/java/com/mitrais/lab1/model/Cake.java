package com.mitrais.lab1.model;

public abstract class Cake {

    protected String name;
    protected double rate;
    

    public Cake(String name, double rate) {
        this.name = name;
        this.rate = rate;        
    }
    public String getName() {
      return name;
   }
    public double getRate(){
        return rate;
    }


    public abstract double calcPrice();

    @Override
    public String toString() {
        return "com.mitrais.lab1.model.Cake{"
                + "name='" + name + '\''
                + ", rate=" + rate
                + '}';
    }
}
