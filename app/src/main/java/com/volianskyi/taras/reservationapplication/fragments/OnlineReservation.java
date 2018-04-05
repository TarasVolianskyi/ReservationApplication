package com.volianskyi.taras.reservationapplication.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.volianskyi.taras.reservationapplication.MainActivity;
import com.volianskyi.taras.reservationapplication.R;

import java.util.Date;

/**
 * Created by tarasvolianskyi on 29.01.18.
 */

public class OnlineReservation extends Fragment implements View.OnClickListener {
    private View view;
    Bundle bundle;
    private Button btnEmployee;
    private Button btnOption;
    private Button btnDateAndTime;
    private Button btnMakeReservation;
    private TextView tvEmployeeChosed;
    private TextView tvOptionChosed;
    private TextView tvDateAndTimeChosed;
    private String employeeChosed;
    private String optionChosed;
    private String dateAndTimeChosed = "";
    Date date = new Date();



    int res = 1;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.online_reservation, container, false);
        initView();
        return view;
    }

    private void initView() {
        bundle = this.getArguments();
        if (bundle != null) {
            dateAndTimeChosed = bundle.getString(TimeForReservation.TAG_CHOOSED_FULL_TIME, "");

        }

        Toast.makeText(getContext(), dateAndTimeChosed, Toast.LENGTH_SHORT).show();
        btnEmployee = (Button) view.findViewById(R.id.btn_employee_online_reservation_layout);
        btnOption = (Button) view.findViewById(R.id.btnOptionOnlineReservationLayout);
        btnDateAndTime = (Button) view.findViewById(R.id.btnDateAndTimeOnlineReservationLayout);
        btnMakeReservation = (Button) view.findViewById(R.id.btnMakeReservationOnlineReservationLayout);
        btnEmployee.setOnClickListener(this);
        btnOption.setOnClickListener(this);
        btnDateAndTime.setOnClickListener(this);
        btnMakeReservation.setOnClickListener(this);
        btnMakeReservation.setText("rrrrrrrrr");

        tvEmployeeChosed = (TextView) view.findViewById(R.id.tv_chosed_employee_online_reservation_layout);
        tvOptionChosed = (TextView) view.findViewById(R.id.tv_chosed_option_online_reservation_layout);
        tvDateAndTimeChosed = (TextView) view.findViewById(R.id.tv_chosed_date_and_time_online_reservation_layout);
        tvDateAndTimeChosed.setText(dateAndTimeChosed);
        if (res == 2) {
            btnMakeReservation.setVisibility(View.VISIBLE);
        }

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_employee_online_reservation_layout:
                Toast.makeText(getActivity(), "Click on next", Toast.LENGTH_SHORT).show();
                ((MainActivity) getActivity()).goToCalendar();
                break;
            case R.id.btnOptionOnlineReservationLayout:
                Toast.makeText(getActivity(), "Click on next", Toast.LENGTH_SHORT).show();
                ((MainActivity) getActivity()).goToCalendar();
                break;
            case R.id.btnDateAndTimeOnlineReservationLayout:
                Toast.makeText(getActivity(), "Click on next", Toast.LENGTH_SHORT).show();
                ((MainActivity) getActivity()).goToCalendar();
                break;
            case R.id.btnMakeReservationOnlineReservationLayout:
                Toast.makeText(getActivity(), "Make reservation", Toast.LENGTH_SHORT).show();
                // ((MainActivity) getActivity()).goToCalendar();
                break;
        }
    }
}
