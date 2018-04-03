package com.volianskyi.taras.reservationapplication.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import com.volianskyi.taras.reservationapplication.MainActivity;
import com.volianskyi.taras.reservationapplication.R;

public class TimeForReservation extends Fragment implements View.OnClickListener {

    View view;
    private int choosedDay;
    private int choosedMonth;
    private int choosedYear;
    TextView textViewAlreadyChoosedDate;
    TextView textViewAlreadyChoosedTime;
    String textAlreadyChoosedDate;
    String textAlreadyChoosedTime;
    TableRow tableRowMorn;
    TableRow tableRowDayFirst;
    TableRow tableRowDaySecond;
    TableRow tableRowEvening;


    private Button btnVisibityMorning;
    private Button btnVisibityDay;
    private Button btnVisibityEvening;

    private Button btnTimeR1C1;
    private Button btnTimeR1C2;
    private Button btnTimeR1C3;
    private Button btnTimeR1C4;

    private Button btnTimeR2C1;
    private Button btnTimeR2C2;
    private Button btnTimeR2C3;
    private Button btnTimeR2C4;

    private Button btnTimeR3C1;
    private Button btnTimeR3C2;
    private Button btnTimeR3C3;
    private Button btnTimeR3C4;

    private Button btnTimeR4C1;
    private Button btnTimeR4C2;
    private Button btnTimeR4C3;
    private Button btnTimeR4C4;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.time_for_reservation_fragment, container, false);

        Bundle bundle = this.getArguments();
        if (bundle != null) {
            choosedDay = bundle.getInt(CalendarForReservation.TAG_CHOOSED_DAY, 0);
            choosedMonth = bundle.getInt(CalendarForReservation.TAG_CHOOSED_MONTH, 0);
            choosedYear = bundle.getInt(CalendarForReservation.TAG_CHOOSED_YEAR, 0);
        }
        initView();
        return view;
    }

    private void initView() {
        textViewAlreadyChoosedDate = (TextView) view.findViewById(R.id.tv_text_of_already_choosed_date_time_reservation_fragment);
        textAlreadyChoosedDate = choosedDay + "." + choosedMonth + "." + choosedYear;
        textViewAlreadyChoosedDate.setText(textAlreadyChoosedDate);

        textViewAlreadyChoosedTime = (TextView) view.findViewById(R.id.tv_text_of_already_choosed_time_for_time_reservation_fragment);
        visibilityButtonsView();
        morningSection();
        daySection();
        eveningSection();
    }


    private void visibilityButtonsView() {
        btnVisibityMorning = (Button) view.findViewById(R.id.btn_vis_gone_morn_time_reservation_fragment);
        btnVisibityDay = (Button) view.findViewById(R.id.btn_vis_gone_day_time_reservation_fragment);
        btnVisibityEvening = (Button) view.findViewById(R.id.btn_vis_gone_even_time_reservation_fragment);
        btnVisibityMorning.setOnClickListener(this);
        btnVisibityDay.setOnClickListener(this);
        btnVisibityEvening.setOnClickListener(this);

        tableRowMorn = (TableRow) view.findViewById(R.id.rowMorn);
        tableRowDayFirst = (TableRow) view.findViewById(R.id.rowDayFirst);
        tableRowDaySecond = (TableRow) view.findViewById(R.id.rowDaySecond);
        tableRowEvening = (TableRow) view.findViewById(R.id.rowDayEvening);
    }

    private void morningSection() {
        btnTimeR1C1 = (Button) view.findViewById(R.id.btn_time_r1c1_time_reservation_fragment);
        btnTimeR1C2 = (Button) view.findViewById(R.id.btn_time_r1c2_time_reservation_fragment);
        btnTimeR1C3 = (Button) view.findViewById(R.id.btn_time_r1c3_time_reservation_fragment);
        btnTimeR1C4 = (Button) view.findViewById(R.id.btn_time_r1c4_time_reservation_fragment);
        btnTimeR1C1.setOnClickListener(this);
        btnTimeR1C2.setOnClickListener(this);
        btnTimeR1C3.setOnClickListener(this);
        btnTimeR1C4.setOnClickListener(this);
    }

    private void daySection() {
        btnTimeR2C1 = (Button) view.findViewById(R.id.btn_time_r2c1_time_reservation_fragment);
        btnTimeR2C2 = (Button) view.findViewById(R.id.btn_time_r2c2_time_reservation_fragment);
        btnTimeR2C3 = (Button) view.findViewById(R.id.btn_time_r2c3_time_reservation_fragment);
        btnTimeR2C4 = (Button) view.findViewById(R.id.btn_time_r2c4_time_reservation_fragment);
        btnTimeR2C1.setOnClickListener(this);
        btnTimeR2C2.setOnClickListener(this);
        btnTimeR2C3.setOnClickListener(this);
        btnTimeR2C4.setOnClickListener(this);

        btnTimeR3C1 = (Button) view.findViewById(R.id.btn_time_r3c1_time_reservation_fragment);
        btnTimeR3C2 = (Button) view.findViewById(R.id.btn_time_r3c2_time_reservation_fragment);
        btnTimeR3C3 = (Button) view.findViewById(R.id.btn_time_r3c3_time_reservation_fragment);
        btnTimeR3C4 = (Button) view.findViewById(R.id.btn_time_r3c4_time_reservation_fragment);
        btnTimeR3C1.setOnClickListener(this);
        btnTimeR3C2.setOnClickListener(this);
        btnTimeR3C3.setOnClickListener(this);
        btnTimeR3C4.setOnClickListener(this);

    }

    private void eveningSection() {
        btnTimeR4C1 = (Button) view.findViewById(R.id.btn_time_r4c1_time_reservation_fragment);
        btnTimeR4C2 = (Button) view.findViewById(R.id.btn_time_r4c2_time_reservation_fragment);
        btnTimeR4C3 = (Button) view.findViewById(R.id.btn_time_r4c3_time_reservation_fragment);
        btnTimeR4C4 = (Button) view.findViewById(R.id.btn_time_r4c4_time_reservation_fragment);
        btnTimeR4C1.setOnClickListener(this);
        btnTimeR4C2.setOnClickListener(this);
        btnTimeR4C3.setOnClickListener(this);
        btnTimeR4C4.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            //visibility buttons
            case R.id.btn_vis_gone_morn_time_reservation_fragment:
                Toast.makeText(getActivity(), "Click on morning visibility", Toast.LENGTH_SHORT).show();
                changeVisibilityOfRows(tableRowMorn);
                break;
            case R.id.btn_vis_gone_day_time_reservation_fragment:
                Toast.makeText(getActivity(), "Click on day visibility", Toast.LENGTH_SHORT).show();
                changeVisibilityOfRows(tableRowDayFirst);
                changeVisibilityOfRows(tableRowDaySecond);
                break;
            case R.id.btn_vis_gone_even_time_reservation_fragment:
                Toast.makeText(getActivity(), "Click on evening visibility", Toast.LENGTH_SHORT).show();
                changeVisibilityOfRows(tableRowEvening);
                break;

            //morning row
            case R.id.btn_time_r1c1_time_reservation_fragment:
                textAlreadyChoosedTime = btnTimeR1C1.getText().toString();
                Toast.makeText(getActivity(), textAlreadyChoosedTime, Toast.LENGTH_SHORT).show();
                textViewAlreadyChoosedTime.setText(textAlreadyChoosedTime);
                break;
            case R.id.btn_time_r1c2_time_reservation_fragment:
                textAlreadyChoosedTime = btnTimeR1C2.getText().toString();
                Toast.makeText(getActivity(), textAlreadyChoosedTime, Toast.LENGTH_SHORT).show();
                textViewAlreadyChoosedTime.setText(textAlreadyChoosedTime);
                break;
            case R.id.btn_time_r1c3_time_reservation_fragment:
                textAlreadyChoosedTime = btnTimeR1C3.getText().toString();
                Toast.makeText(getActivity(), textAlreadyChoosedTime, Toast.LENGTH_SHORT).show();
                textViewAlreadyChoosedTime.setText(textAlreadyChoosedTime);
                break;
            case R.id.btn_time_r1c4_time_reservation_fragment:
                textAlreadyChoosedTime = btnTimeR1C4.getText().toString();
                Toast.makeText(getActivity(), textAlreadyChoosedTime, Toast.LENGTH_SHORT).show();
                textViewAlreadyChoosedTime.setText(textAlreadyChoosedTime);
                break;

            //day first row
            case R.id.btn_time_r2c1_time_reservation_fragment:
                textAlreadyChoosedTime = btnTimeR2C1.getText().toString();
                Toast.makeText(getActivity(), textAlreadyChoosedTime, Toast.LENGTH_SHORT).show();
                textViewAlreadyChoosedTime.setText(textAlreadyChoosedTime);
                break;
            case R.id.btn_time_r2c2_time_reservation_fragment:
                textAlreadyChoosedTime = btnTimeR2C2.getText().toString();
                Toast.makeText(getActivity(), textAlreadyChoosedTime, Toast.LENGTH_SHORT).show();
                textViewAlreadyChoosedTime.setText(textAlreadyChoosedTime);
                break;
            case R.id.btn_time_r2c3_time_reservation_fragment:
                textAlreadyChoosedTime = btnTimeR2C3.getText().toString();
                Toast.makeText(getActivity(), textAlreadyChoosedTime, Toast.LENGTH_SHORT).show();
                textViewAlreadyChoosedTime.setText(textAlreadyChoosedTime);
                break;
            case R.id.btn_time_r2c4_time_reservation_fragment:
                textAlreadyChoosedTime = btnTimeR2C4.getText().toString();
                Toast.makeText(getActivity(), textAlreadyChoosedTime, Toast.LENGTH_SHORT).show();
                textViewAlreadyChoosedTime.setText(textAlreadyChoosedTime);
                break;

            //day second row
            case R.id.btn_time_r3c1_time_reservation_fragment:
                textAlreadyChoosedTime = btnTimeR3C1.getText().toString();
                Toast.makeText(getActivity(), textAlreadyChoosedTime, Toast.LENGTH_SHORT).show();
                textViewAlreadyChoosedTime.setText(textAlreadyChoosedTime);
                break;
            case R.id.btn_time_r3c2_time_reservation_fragment:
                textAlreadyChoosedTime = btnTimeR3C2.getText().toString();
                Toast.makeText(getActivity(), textAlreadyChoosedTime, Toast.LENGTH_SHORT).show();
                textViewAlreadyChoosedTime.setText(textAlreadyChoosedTime);
                break;
            case R.id.btn_time_r3c3_time_reservation_fragment:
                textAlreadyChoosedTime = btnTimeR3C3.getText().toString();
                Toast.makeText(getActivity(), textAlreadyChoosedTime, Toast.LENGTH_SHORT).show();
                textViewAlreadyChoosedTime.setText(textAlreadyChoosedTime);
                break;
            case R.id.btn_time_r3c4_time_reservation_fragment:
                textAlreadyChoosedTime = btnTimeR3C4.getText().toString();
                Toast.makeText(getActivity(), textAlreadyChoosedTime, Toast.LENGTH_SHORT).show();
                textViewAlreadyChoosedTime.setText(textAlreadyChoosedTime);
                break;

            //evening row
            case R.id.btn_time_r4c1_time_reservation_fragment:
                textAlreadyChoosedTime = btnTimeR4C1.getText().toString();
                Toast.makeText(getActivity(), textAlreadyChoosedTime, Toast.LENGTH_SHORT).show();
                textViewAlreadyChoosedTime.setText(textAlreadyChoosedTime);
                break;
            case R.id.btn_time_r4c2_time_reservation_fragment:
                textAlreadyChoosedTime = btnTimeR4C2.getText().toString();
                Toast.makeText(getActivity(), textAlreadyChoosedTime, Toast.LENGTH_SHORT).show();
                textViewAlreadyChoosedTime.setText(textAlreadyChoosedTime);
                break;
            case R.id.btn_time_r4c3_time_reservation_fragment:
                textAlreadyChoosedTime = btnTimeR4C3.getText().toString();
                Toast.makeText(getActivity(), textAlreadyChoosedTime, Toast.LENGTH_SHORT).show();
                textViewAlreadyChoosedTime.setText(textAlreadyChoosedTime);
                break;
            case R.id.btn_time_r4c4_time_reservation_fragment:
                textAlreadyChoosedTime = btnTimeR4C4.getText().toString();
                Toast.makeText(getActivity(), textAlreadyChoosedTime, Toast.LENGTH_SHORT).show();
                textViewAlreadyChoosedTime.setText(textAlreadyChoosedTime);
                break;



        }
    }

    private void changeVisibilityOfRows(TableRow tableRowForMethod) {
        if (tableRowForMethod.getVisibility() == View.VISIBLE) {
            tableRowForMethod.setVisibility(View.GONE);
        } else {
            tableRowForMethod.setVisibility(View.VISIBLE);
        }

    }
}
