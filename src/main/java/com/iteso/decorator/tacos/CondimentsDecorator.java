package com.iteso.decorator.tacos;

import com.iteso.decorator.Taco;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/19/13
 * Time: 12:46 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class CondimentsDecorator extends Taco {
    public abstract String getDescription();
    public abstract Taco getOriginalTaco();
}
