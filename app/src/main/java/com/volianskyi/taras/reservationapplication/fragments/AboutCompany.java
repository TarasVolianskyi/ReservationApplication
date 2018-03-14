package com.volianskyi.taras.reservationapplication.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.volianskyi.taras.reservationapplication.R;

/**
 * Created by tarasvolianskyi on 29.01.18.
 */

public class AboutCompany extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.about_company, container, false);
        TextView textView = (TextView) view.findViewById(R.id.tvNameEmployeeView);
        return view;
    }
}
