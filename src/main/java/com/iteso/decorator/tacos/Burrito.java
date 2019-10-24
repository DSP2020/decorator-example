package com.iteso.decorator.tacos;

import com.iteso.decorator.Taco;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/19/13
 * Time: 12:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class Burrito extends Taco {
    public Burrito(){
        description = "Burrito";
    }

    @Override
    public double cost() {
        return 10.00;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
