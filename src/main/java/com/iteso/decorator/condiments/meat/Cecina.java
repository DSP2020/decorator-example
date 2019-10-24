package com.iteso.decorator.condiments.meat;

import com.iteso.decorator.CondimentsDecorator;
import com.iteso.decorator.Taco;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/19/13
 * Time: 4:03 PM
 * To change this template use File | Settings | File Templates.
 */
public class Cecina extends CondimentsDecorator{
    Taco taco;

    public Cecina(Taco taco){
        this.taco = taco;
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " de cecina";
    }

    @Override
    public double cost() {
        return 3 + taco.cost();
    }
}
