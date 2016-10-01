package com.example.blfab.projettd4;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.NumberPicker;
import android.widget.Toast;

/**
 * Created by Blfab on 26/09/2016.
 */
public class NumberPickerFragment extends Fragment {

    NumberPicker aNumberPicker;
    OnActionListener mListener;

    public interface OnActionListener  {
        public void OnAction(int position);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        /*----Inflater du layout number_picker_fragment----*/
        View view = inflater.inflate(R.layout.number_picker_fragment, container, false);

        /*----Number picker du layout number_picker_fragment----*/
        aNumberPicker = (NumberPicker) view.findViewById(R.id.numberPicker);

        /*----DEFINITION DES VALEURS DU NUMBER PICKER----*/
        aNumberPicker.setMaxValue(20);
        aNumberPicker.setMinValue(0);
        aNumberPicker.setValue(1); //Valeur par défaut

        aNumberPicker.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
                mListener.OnAction(aNumberPicker.getValue());
            }
        });

        return view;
    }

    @Override
     public void onAttach (Activity activity){
        super.onAttach(activity);
        try {
            mListener = (OnActionListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnActionListener");
        }
    }

}
