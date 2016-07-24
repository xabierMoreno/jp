package com.jp.main.repository;

import com.jp.main.classes.Stock;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xabier on 24/07/2016.
 */
public class StockRepository {

    public List<Stock> getListStock(){
        List<Stock> stocks = new ArrayList<>();
        Stock stock = new Stock("TEA","COMMON",0,0,100);
        Stock stock1 = new Stock("POP","COMMON",8,0,100);
        Stock stock2 = new Stock("ALE","COMMON",23,0,60);
        Stock stock3 = new Stock("GIN","PREFERRED",8,2,100);
        Stock stock4 = new Stock("JOE","COMMON",13,0,250);
        stocks.add(stock);
        stocks.add(stock1);
        stocks.add(stock2);
        stocks.add(stock3);
        stocks.add(stock4);
        return stocks;
    }
}
