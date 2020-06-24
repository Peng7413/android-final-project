package com.example.grandfinal.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.grandfinal.R;
import com.example.grandfinal.fragment1;
import com.example.grandfinal.fragment2;
import com.example.grandfinal.fragment3;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2,R.string.tab_text_3};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment =null;
        switch (position){
            case 0:
                fragment = new fragment1();
                break;
            case 1:
                fragment = new fragment2();
                break;
            case 2:
                fragment = new fragment3();
                break;
        }
        return fragment;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "碼表";
            case 1:
                return "倒數計時器";
            case 2:
                return "鬧鐘";
        }
        return "null";
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return 3;
    }
}