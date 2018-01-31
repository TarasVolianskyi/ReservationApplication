package com.volianskyi.taras.reservationapplication.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;

import com.volianskyi.taras.reservationapplication.R;

/**
 * Created by tarasvolianskyi on 29.01.18.
 */

public class OnlineReservation extends Fragment implements View.OnClickListener {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.online_reservation, container, false);
        intiView();
        return view;
    }

    private void intiView() {
       /* Button btnEmployee = (Button) getView().findViewById(R.id.btnEmployeeOnlineReservationLayout);
        Button btnOption = (Button) getView().findViewById(R.id.btnOptionOnlineReservationLayout);
        Button btnDateAndTime = (Button) getView().findViewById(R.id.btnDateAndTimeOnlineReservationLayout);
        btnEmployee.setOnClickListener(this);
        btnOption.setOnClickListener(this);
        btnDateAndTime.setOnClickListener(this);
        */
        Button btnDateAndTime = (Button) getView().findViewById(R.id.btnDateAndTimeOnlineReservationLayout);
        btnDateAndTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }

    @Override
    public void onClick(View view) {

    }
}

