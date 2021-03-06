package com.example.blfab.projettd4;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import org.w3c.dom.Text;

/**
 * Created by Blfab on 26/09/2016.
 */
public class ExamplePagerAdapter extends FragmentStatePagerAdapter {
    public ExamplePagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {

        Fragment fragment = null;
        switch (i) {
            case 0:
                fragment = new TextFragment();
                break;

            case 1:
                fragment = new  NumberPickerFragment();
                break;
            default:
                break;
        }

        return fragment;
    }

    @Override
    public int getCount() {
        //le nombre d’onglet
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "myFrag";
    }
}
