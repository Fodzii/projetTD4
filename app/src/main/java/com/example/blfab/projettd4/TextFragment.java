package com.example.blfab.projettd4;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Blfab on 26/09/2016.
 */
public class TextFragment extends Fragment {

    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
                /*----INFLATER DU LAYOUT text_fragment----*/
        view = inflater.inflate(R.layout.text_fragment, container, false);

        return view;
    }

}

