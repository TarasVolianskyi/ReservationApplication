package com.volianskyi.taras.reservationapplication.pojo;

/**
 * Created by tarasvolianskyi on 03.02.18.
 */

public class EmployeePojo {

    private String nameOfEmployee;
    private String optionsOfEmployee;

    public EmployeePojo() {
    }

    public EmployeePojo(String nameOfEmployee, String optionsOfEmployee) {
        this.nameOfEmployee = nameOfEmployee;
        this.optionsOfEmployee = optionsOfEmployee;
    }

    public String getNameOfEmployee() {
        return nameOfEmployee;
    }

    public void setNameOfEmployee(String nameOfEmployee) {
        this.nameOfEmployee = nameOfEmployee;
    }

    public String getOptionsOfEmployee() {
        return optionsOfEmployee;
    }

    public void setOptionsOfEmployee(String optionsOfEmployee) {
        this.optionsOfEmployee = optionsOfEmployee;
    }
}
