package com.iteso.decorator.condiments.meat;

import com.iteso.decorator.tacos.CondimentsDecorator;
import com.iteso.decorator.Taco;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/19/13
 * Time: 4:03 PM
 * To change this template use File | Settings | File Templates.
 */
public class FlorJamaica extends CondimentsDecorator{
    Taco taco;

    public FlorJamaica(Taco taco){
        this.taco = taco;
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " vegano";
    }

    @Override
    public double cost() {
        return 5 + taco.cost();
    }
}
