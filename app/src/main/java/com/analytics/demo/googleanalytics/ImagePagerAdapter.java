package com.analytics.demo.googleanalytics;


import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.Locale;

/**
 * Created by Yuriy on 2016-06-21 GoogleAnalytics.
 */

public class ImagePagerAdapter extends FragmentPagerAdapter {

    private final ImageInfo[] infos;
    private Context context;

    public ImagePagerAdapter(FragmentManager fm, ImageInfo[] infos, Context context) {
        super(fm);
        this.infos = infos;
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        ImageInfo info = infos[position];
        return ImageFragment.newInstance(info.image);
    }

    @Override
    public int getCount() {
        return infos.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position < 0 || position >= infos.length) return null;

        ImageInfo info = infos[position];
        return context.getString(info.title).toUpperCase(Locale.getDefault());
    }
}
