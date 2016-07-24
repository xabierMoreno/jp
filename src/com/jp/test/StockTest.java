package com.jp.test;

import com.jp.main.classes.Stock;
import com.jp.main.services.StockService;
import com.jp.main.services.impl.StockServiceImpl;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by xabier on 24/07/2016.
 */
public class StockTest {

    StockService stockService;

    @Test
    public void testCalculateDividend(){
        //Given
        stockService = new StockServiceImpl();
        String stockId = "TEA";

        //When
        stockService.getDividend(stockId);

        //Then
        assertEquals(true);
    }

    @Test
    public void testCalculatePERatio(){
        //Given
        stockService = new StockServiceImpl();
        String stockId = "TEA";

        //When
        stockService.getPEratio(stockId);

        //Then
        assertEquals(true);
    }

    @Test
    public void testSaveStock(){
        //Given
        stockService = new StockServiceImpl();
        Stock stock = new Stock("TEST","COMMON",100,0,100);

        //When
        stockService.saveStock(stock);

        //Then
        assertEquals(true);
    }

    @Test
    public void testBasPrice(){
        //Given
        stockService = new StockServiceImpl();
        String stockId = "TEA";

        //When
        stockService.calculateBasePrice(stockId);

        //Then
        assertEquals(true);
    }

    @Test
    public void testcalculateGBCE(){
        //Given
        stockService = new StockServiceImpl();

        //When
        stockService.calculateGBCE();

        //Then
        assertEquals(true);
    }
}
