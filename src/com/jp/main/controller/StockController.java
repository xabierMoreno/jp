package com.jp.main.controller;

import com.jp.main.classes.Stock;
import com.jp.main.services.StockService;
import com.jp.main.services.impl.StockServiceImpl;

/**
 * Created by xabier on 24/07/2016.
 */
public class StockController {

    StockService stockService = new StockServiceImpl();
    public int calculateDividend(String stockId){
        return stockService.getDividend(stockId);
    }

    public int calculatePEratio(String stockId){
        return stockService.getPEratio(stockId);
    }

    public void saveStock(Stock stock){
        stockService.saveStock(stock);
    }

    public int basePrice(String stockId){
        return stockService.calculateBasePrice(stockId);
    }

    public int calculateGBCE(){
        return stockService.calculateGBCE();
    }

}
