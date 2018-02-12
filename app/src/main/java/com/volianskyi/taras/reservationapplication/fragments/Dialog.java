package com.volianskyi.taras.reservationapplication.fragments;

/**
 * Created by tarasvolianskyi on 12.02.18.
 */

public class Dialog {
    private static final Dialog ourInstance = new Dialog();

    public static Dialog getInstance() {
        return ourInstance;
    }

    private Dialog() {
    }
}
