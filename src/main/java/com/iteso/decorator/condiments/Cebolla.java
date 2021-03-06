package com.iteso.decorator.condiments;

import com.iteso.decorator.tacos.CondimentsDecorator;
import com.iteso.decorator.Taco;
import com.iteso.decorator.behaviors.Behavior3;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/19/13
 * Time: 1:11 PM
 * To change this template use File | Settings | File Templates.
 */
public class Cebolla extends CondimentsDecorator{
    Taco taco;

    public Cebolla (Taco taco){
        this.taco = taco;
        this.taco.setNotDefined(new Behavior3());
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " con cebolla";
    }

    @Override
    public Taco getOriginalTaco() {
        return this.taco;
    }

    @Override
    public double cost() {
        return 0.5 + taco.cost();
    }

}
