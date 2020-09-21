package com.example.designpatternfactory13072020;

public class BankFatory {
    private BankFatory(){

    }
    public static Bank createBank(BankType bankType) throws IllegalAccessException {
        switch (bankType){
            case TPBANK:
                return new TPBank();
            case VIETCOMBANK:
                return new VietcomBank();
            default:
                throw new IllegalAccessException("Sai cau truc");
        }
    }
}
