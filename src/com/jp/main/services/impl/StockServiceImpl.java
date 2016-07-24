package com.jp.main.services.impl;

import com.jp.main.classes.Stock;
import com.jp.main.repository.StockRepository;
import com.jp.main.services.StockService;

/**
 * Created by xabier on 24/07/2016.
 */
public class StockServiceImpl implements StockService {


    @Override
    public int getDividend(String stockId) {
        return 0;
    }

    @Override
    public int getPEratio(String stockId) {
        return 0;
    }

    @Override
    public void saveStock(Stock stock) {

    }

    @Override
    public int calculateBasePrice(String stockId) {
        return 0;
    }

    @Override
    public int calculateGBCE() {
        return 0;
    }
}
