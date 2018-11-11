package com.example.rkddl.gmappractice.view.activity;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.example.rkddl.gmappractice.presenter.MapsActivityPresenter;
import com.example.rkddl.gmappractice.view.fragment.MapsFragment;
import com.example.rkddl.gmappractice.R;

public class MapsActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        new MapsActivityPresenter(this);
    }
}
