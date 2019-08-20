package com.pax.dagger.fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.pax.dagger.R;
import com.pax.dagger.activity.Car;

import javax.inject.Inject;

import dagger.android.support.AndroidSupportInjection;


public class BlankFragment extends Fragment {
    @Inject
    Car mCar;

    public BlankFragment() {
    }

    @Override
    public void onAttach(Context context) {
        AndroidSupportInjection.inject(this);
        super.onAttach(context);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blank, container, false);

        if (view != null) {
            TextView textView = view.findViewById(R.id.what_car);
            textView.setText(mCar.toString());
        }
        return view;
    }

}
