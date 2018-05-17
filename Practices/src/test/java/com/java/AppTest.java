package com.java;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void getChash(){
        String goods = "洗发水-N";
        assertEquals("20 元",new CashTest().getCash(goods));
    }

    @Test
    public void isBargain(){
        String goods = "沐浴露-A";
        String goods2 = "牙膏-B";
        assertEquals(false,new CashTest().isBargain(goods));
        assertEquals(true,new CashTest().isBargain(goods2));
    }

}
