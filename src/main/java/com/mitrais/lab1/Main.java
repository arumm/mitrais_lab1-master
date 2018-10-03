package com.mitrais.lab1;

import com.mitrais.lab1.model.Cake;
import com.mitrais.lab1.model.OrderCake;
import com.mitrais.lab1.model.ReadyMadeCake;

/**
 * Created by jchacana on 9/30/18.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("This is my Main class");

        Cake[] orderCakeArray = new Cake[20];
        Cake[] readyMadeCakeArray = new Cake[20];
        for (int i = 0; i < orderCakeArray.length; i++) {
            Cake orderCake = new OrderCake("cake_" + i, (i + 1) * 1000, (i + 1) * 10);
            Cake cakeReadyMade = new ReadyMadeCake("cake_" + i, (i + 1) * 1000, (i + 1) * 30);
            orderCakeArray[i] = orderCake;
            readyMadeCakeArray[i] = cakeReadyMade;
        }
        
        System.out.println("order Cake");
        for (int j = 0; j < orderCakeArray.length; j++) {
            System.out.printf("Name : %s, Rate : %s, calPrice : %s \n",
                    orderCakeArray[j].getName(),
                    orderCakeArray[j].getRate(),
                    orderCakeArray[j].calcPrice());
        }
        System.out.println("Ready Made Cake");
        for (int k = 0; k < readyMadeCakeArray.length; k++) {
            System.out.printf("Name : %s, Rate : %s, calPrice : %s \n",
                    readyMadeCakeArray[k].getName(),
                    readyMadeCakeArray[k].getRate(),
                    readyMadeCakeArray[k].calcPrice());
        }        
    }
}
