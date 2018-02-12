package com.volianskyi.taras.reservationapplication.pojo;

/**
 * Created by tarasvolianskyi on 03.02.18.
 */

public class OptionsPogo {
    private String optionsId;
    private String nameOfOption;
    private int priceOfOption;

    public OptionsPogo() {
    }

    public OptionsPogo(String optionsId, String nameOfOption, int priceOfOption) {
        this.optionsId = optionsId;
        this.nameOfOption = nameOfOption;
        this.priceOfOption = priceOfOption;
    }

    public String getOptionsId() {
        return optionsId;
    }

    public void setOptionsId(String optionsId) {
        this.optionsId = optionsId;
    }

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
