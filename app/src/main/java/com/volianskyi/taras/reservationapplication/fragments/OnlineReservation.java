package com.volianskyi.taras.reservationapplication.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.volianskyi.taras.reservationapplication.R;

/**
 * Created by tarasvolianskyi on 29.01.18.
 */

public class OnlineReservation extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.online_reservation, container, false);
        return view;
    }
}
