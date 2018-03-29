package com.volianskyi.taras.reservationapplication.fragments;

import android.annotation.SuppressLint;
import android.icu.util.Calendar;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CalendarView;
import android.widget.Toast;

import com.prolificinteractive.materialcalendarview.CalendarDay;
import com.prolificinteractive.materialcalendarview.CalendarMode;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import com.volianskyi.taras.reservationapplication.MainActivity;
import com.volianskyi.taras.reservationapplication.R;

/**
 * Created by tarasvolianskyi on 31.01.18.
 */

public class CalendarForReservation /*extends AppCompatActivity*/ extends Fragment implements View.OnClickListener {
    View view;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.calendar_for_reservation, container, false);
        // intiView();
        initCalendarView();
        return view;
    }

    private void initCalendarView() {
        CalendarView calendarView = (CalendarView) view.findViewById(R.id.cv_calendar_for_reservation);
        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {

            @SuppressLint("WrongConstant")
            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month,
                                            int dayOfMonth) {
                Toast.makeText(getContext(), "" + dayOfMonth + " - " + month, 0).show();
                //  DialogFragment dialogFragment = new Dialog();
                //  dialog.show(getSupportFragmentManager(),"dialog");
                // dialogFragment.show(getFragmentManager(), "dialog");
/*
                Dialog dialog = new Dialog();
                Bundle bundle = new Bundle();
                bundle.putString(TAG_MAIN_FRAGMENT, getTag());
                dialog.setArguments(bundle);
                dialog.show(getFragmentManager(), Dialog.TAG_ADDING_NEW_ITEM);
                //Toast.makeText(, "", Toast.LENGTH_SHORT).show();*/

            }
        });
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnDateAndTimeOnlineReservationLayout:
                Toast.makeText(getActivity(), "Click on next", Toast.LENGTH_SHORT).show();
                ((MainActivity) getActivity()).goToCalendar();
                break;
        }
    }



   /* @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calendar_for_reservation);
        intiView();
    }*/

   /* private void intiView() {
        MaterialCalendarView materialCalendarView = (MaterialCalendarView) view.findViewById(R.id.calendarView);
        materialCalendarView.state().edit()
                .setFirstDayOfWeek(Calendar.MONDAY)
                .setMinimumDate(CalendarDay.from(1900, 1, 1))
                .setMaximumDate(CalendarDay.from(2100, 12, 31))
                .setCalendarDisplayMode(CalendarMode.MONTHS)
                .commit();


    }*/
}
