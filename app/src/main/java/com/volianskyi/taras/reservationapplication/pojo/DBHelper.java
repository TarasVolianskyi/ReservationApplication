package com.volianskyi.taras.reservationapplication.pojo;

/**
 * Created by tarasvolianskyi on 05.02.18.
 */

public class DBHelper {
    private String name;
    private String lastName;

    public DBHelper(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
