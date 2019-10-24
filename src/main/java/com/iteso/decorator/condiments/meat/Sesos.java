package com.iteso.decorator.condiments.meat;

import com.iteso.decorator.CondimentsDecorator;
import com.iteso.decorator.Taco;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/19/13
 * Time: 1:14 PM
 * To change this template use File | Settings | File Templates.
 */
public class Sesos extends CondimentsDecorator {
    Taco taco;

    public Sesos(Taco taco){
        this.taco = taco;
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " de sesos";
    }

    @Override
    public double cost() {
        return 2 + taco.cost();  //To change body of implemented methods use File | Settings | File Templates.
    }
}
