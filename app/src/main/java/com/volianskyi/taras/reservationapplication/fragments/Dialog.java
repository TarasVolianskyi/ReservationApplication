package com.volianskyi.taras.reservationapplication.fragments;

/**
 * Created by tarasvolianskyi on 12.02.18.
 */

public class Dialog {
    private static final Dialog ourInstance = new Dialog();
String name;
String login;
int count;
String lastName;

    public Dialog(String name, String login, int count, String lastName) {
        this.name = name;
        this.login = login;
        this.count = count;
        this.lastName = lastName;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public static Dialog getInstance() {
        return ourInstance;
    }

    private Dialog() {
    }

    public static Dialog getOurInstance() {
        return ourInstance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dialog{}";
    }
}
