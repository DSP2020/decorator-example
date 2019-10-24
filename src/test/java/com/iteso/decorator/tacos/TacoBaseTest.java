package com.iteso.decorator.tacos;

import com.iteso.decorator.Taco;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 9/20/13
 * Time: 10:42 AM
 * To change this template use File | Settings | File Templates.
 */
public class TacoBaseTest {
    @Test
    public void testCost() {
        Taco taco = new TacoBase();
        assertEquals(8.0, taco.cost(),0);
    }
}
