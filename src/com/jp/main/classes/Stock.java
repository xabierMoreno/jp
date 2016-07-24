package com.jp.main.classes;

/**
 * Created by xabier on 24/07/2016.
 */
public class Stock {

    private String name;

    private String type;

    private int lastDividend;

    private int fixedDividend;

    private int parValue;

    public Stock(String name, String type, int lastDividend, int fixedDividend, int parValue) {
        this.name = name;
        this.type = type;
        this.lastDividend = lastDividend;
        this.fixedDividend = fixedDividend;
        this.parValue = parValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLastDividend() {
        return lastDividend;
    }

    public void setLastDividend(int lastDividend) {
        this.lastDividend = lastDividend;
    }

    public int getFixedDividend() {
        return fixedDividend;
    }

    public void setFixedDividend(int fixedDividend) {
        this.fixedDividend = fixedDividend;
    }

    public int getParValue() {
        return parValue;
    }

    public void setParValue(int parValue) {
        this.parValue = parValue;
    }
}
