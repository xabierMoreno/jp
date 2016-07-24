package com.jp.main.services;

import com.jp.main.classes.Stock;

/**
 * Created by xabier on 24/07/2016.
 */
public interface StockService {

    int getDividend(String stockId);

    int getPEratio(String stockId);

    void saveStock(Stock stock);

    int calculateBasePrice(String stockId);

    int calculateGBCE();

}
