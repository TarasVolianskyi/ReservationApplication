package com.volianskyi.taras.reservationapplication.fragments;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.volianskyi.taras.reservationapplication.R;
import com.volianskyi.taras.reservationapplication.pojo.OptionsPogo;

import java.util.List;

/**
 * Created by tarasvolianskyi on 03.02.18.
 */

public class OptionsList extends ArrayAdapter<OptionsPogo> {

    private Activity context;
    private List<OptionsPogo> arrayOptionsList;

    public OptionsList(@NonNull Context context, int resource) {
        super(context, resource);
    }



    /*
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.online_reservation, container, false);
        initView();
        return view;
    }
    */

   /* private void intiView() {
        Button btnEmployee = (Button) view.findViewById(R.id.btnEmployeeOnlineReservationLayout);
        Button btnOption = (Button) view.findViewById(R.id.btnOptionOnlineReservationLayout);
        Button btnDateAndTime = (Button) view.findViewById(R.id.btnDateAndTimeOnlineReservationLayout);
        btnEmployee.setOnClickListener(this);
        btnOption.setOnClickListener(this);
        btnDateAndTime.setOnClickListener(this);
    }*/







/*
    private void initView() {
        ListView listItemsCatalog = (ListView) view.findViewById(R.id.lvOptionsList);
        ArrayList<Item> arrayList = new ArrayList<>();

        for (int i = 0; i < 17; i++) {
            Item newItem = new Item();
            newItem.setId(i);
            newItem.setName("Product - " + i);
            newItem.setPrice("Prise - " + i * 70);
            newItem.setPrevoiusPrice("Previous price - " + i * 90);
            arrayList.add(newItem);
        }
        MyAdapter myAdapter = new MyAdapter(arrayList, this);
        listItemsCatalog.setAdapter(myAdapter);
    }

*/

}
