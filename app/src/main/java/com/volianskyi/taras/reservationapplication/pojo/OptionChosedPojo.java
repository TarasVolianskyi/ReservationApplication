package com.volianskyi.taras.reservationapplication.pojo;

import java.util.Date;

public class OptionChosedPojo {

    private String idOfEmploye;
    private String idOfOption;
    private Date alreadyChosedTime;
    private String idOfUser;

    public OptionChosedPojo() {

    }

    public OptionChosedPojo(String idOfEmploye, String idOfOption, Date alreadyChosedTime, String idOfUser) {
        this.idOfEmploye = idOfEmploye;
        this.idOfOption = idOfOption;
        this.alreadyChosedTime = alreadyChosedTime;
        this.idOfUser = idOfUser;
    }

    public String getIdOfEmploye() {
        return idOfEmploye;
    }

    public void setIdOfEmploye(String idOfEmploye) {
        this.idOfEmploye = idOfEmploye;
    }

    public String getIdOfOption() {
        return idOfOption;
    }

    public void setIdOfOption(String idOfOption) {
        this.idOfOption = idOfOption;
    }

    public Date getAlreadyChosedTime() {
        return alreadyChosedTime;
    }

    public void setAlreadyChosedTime(Date alreadyChosedTime) {
        this.alreadyChosedTime = alreadyChosedTime;
    }

    public String getIdOfUser() {
        return idOfUser;
    }

    public void setIdOfUser(String idOfUser) {
        this.idOfUser = idOfUser;
    }

}
