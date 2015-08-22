package com.example.silviobravocado.actionbarfragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by silviobravocado on 22/08/15.
 */
public class HolaFragment extends Fragment {


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.home_layout, container, false);
        return view;
    }


}
