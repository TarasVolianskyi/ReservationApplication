package com.volianskyi.taras.reservationapplication.pojo;

/**
 * Created by tarasvolianskyi on 03.02.18.
 */

public class OptionsPogo {
    public OptionsPogo(String nameOfOption, int priceOfOption) {
        this.nameOfOption = nameOfOption;
        this.priceOfOption = priceOfOption;
    }

    private String nameOfOption;
    private int priceOfOption;

    public String getNameOfOption() {
        return nameOfOption;
    }

    public void setNameOfOption(String nameOfOption) {
        this.nameOfOption = nameOfOption;
    }

    public int getPriceOfOption() {
        return priceOfOption;
    }

    public void setPriceOfOption(int priceOfOption) {
        this.priceOfOption = priceOfOption;
    }
}