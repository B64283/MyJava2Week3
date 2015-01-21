package com.example.matthewdarke.myjava2week3;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by matthewdarke on 1/21/15.
 */
public class MainFragment extends ListFragment {

    Button bnImpli;

    View v;


    public MainFragment(){

    }

    //use save instance state with bundles

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        v = inflater.inflate(R.layout.main_fragment, container, false);
        bnImpli = (Button) v.findViewById(R.id.b3);

        return v;

    }
}
