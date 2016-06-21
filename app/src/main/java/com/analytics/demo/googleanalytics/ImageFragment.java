package com.analytics.demo.googleanalytics;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by Yuriy on 2016-06-21 GoogleAnalytics.
 */

public class ImageFragment extends Fragment {

    private static final String ARG_PATTERN = "pattern";
    private int resId;

    public static ImageFragment newInstance(int resId) {
        ImageFragment fragment = new ImageFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_PATTERN, resId);
        fragment.setArguments(args);
        return fragment;
    }

    public ImageFragment() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            resId = getArguments().getInt(ARG_PATTERN);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        if (view != null) {
            ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
            imageView.setImageResource(resId);
        }
        return view;
    }
}
