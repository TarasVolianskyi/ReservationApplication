package com.volianskyi.taras.reservationapplication.fragments;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.volianskyi.taras.reservationapplication.R;
import com.volianskyi.taras.reservationapplication.pojo.OptionsPogo;

import java.util.List;

public class ListOfDataOptionsFromFD extends ArrayAdapter<OptionsPogo> {
    private Activity context;
    private List<OptionsPogo> optionsPogoList;

    public ListOfDataOptionsFromFD(Activity context, List<OptionsPogo> optionsPogoList) {
        super(context, R.layout.options_view);
        this.context = context;
        this.optionsPogoList = optionsPogoList;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();

        View listViewItem = inflater.inflate(R.layout.options_view, null, true);

        TextView textViewNameOptionsView = (TextView) listViewItem.findViewById(R.id.tv_name_options_view);
        TextView textViewPriceOptionsView = (TextView) listViewItem.findViewById(R.id.tv_price_options_view);

        OptionsPogo optionsPogo = optionsPogoList.get(position);
        textViewNameOptionsView.setText(optionsPogo.getNameOfOption());
        textViewPriceOptionsView.setText(optionsPogo.getPriceOfOption());
        return listViewItem;
    }
}
