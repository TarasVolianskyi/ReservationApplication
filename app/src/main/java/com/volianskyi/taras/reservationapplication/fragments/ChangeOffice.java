package com.volianskyi.taras.reservationapplication.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.volianskyi.taras.reservationapplication.MainActivity;
import com.volianskyi.taras.reservationapplication.R;
import com.volianskyi.taras.reservationapplication.pojo.OptionsPogo;

import java.util.zip.Inflater;

/**
 * Created by tarasvolianskyi on 30.01.18.
 */

public class ChangeOffice extends Fragment implements View.OnClickListener {
    View view;
    public String name;
    DatabaseReference databaseReference;
    EditText etNameOfOption;
    EditText etPriceOfOption;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.change_office, container, false);
        initView();
        return view;
    }

    private void initView() {
        Button btnConnectionToFBe = (Button) view.findViewById(R.id.btnConnectToFBChangeOffice);
        etNameOfOption = (EditText) view.findViewById(R.id.etNameForFBCahngeOffice);
        etPriceOfOption = (EditText) view.findViewById(R.id.etPriceForFBCahngeOffice);
        btnConnectionToFBe.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnConnectToFBChangeOffice:
                //Toast.makeText(getActivity(), "Click on next", Toast.LENGTH_SHORT).show();
                //((MainActivity) getActivity()).goToCalendar();
                databaseReference = FirebaseDatabase.getInstance().getReference("user_options");
                addInfoToFB();

                break;
        }
    }

    private void addInfoToFB() {
        String id = databaseReference.push().getKey();
        String nameOfOption = etNameOfOption.getText().toString();
        int priceOfOption = Integer.parseInt(etPriceOfOption.getText().toString());

        OptionsPogo optionsPogo = new OptionsPogo(id, nameOfOption, priceOfOption);
        databaseReference.child(id).setValue(optionsPogo);
        //Toast.makeText(this, "Success", Toast.LENGTH_SHORT).show();
    }
}