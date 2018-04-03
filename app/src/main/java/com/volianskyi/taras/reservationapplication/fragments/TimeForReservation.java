package com.volianskyi.taras.reservationapplication.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.volianskyi.taras.reservationapplication.R;

public class TimeForReservation extends Fragment {

    View view;
    private int choosedDay;
    private int choosedMonth;
    private int choosedYear;
    TextView textViewAlreadyChoosedDate;
    String textAlreadyChoosedDate;

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
        textViewAlreadyChoosedDate=(TextView) view.findViewById(R.id.tv_text_of_already_choosed_date_time_reservation_fragment);
        textAlreadyChoosedDate = choosedDay+"."+choosedMonth+"."+choosedYear;
        textViewAlreadyChoosedDate.setText(textAlreadyChoosedDate);

    }



}
