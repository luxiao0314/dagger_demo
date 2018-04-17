package com.cielyang.android.daggerdemo.dummy;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;

import com.cielyang.android.daggerdemo.R;
import com.example.mine.base.BaseActivity;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasFragmentInjector;
import dagger.android.support.HasSupportFragmentInjector;

public class DummyActivity extends BaseActivity
        implements DummyFragment.OnDummyActivityFragmentInteractionListener,HasFragmentInjector, HasSupportFragmentInjector {

    @Inject
    DispatchingAndroidInjector<android.support.v4.app.Fragment> supportFragmentInjector;
    @Inject DispatchingAndroidInjector<android.app.Fragment> frameworkFragmentInjector;


    @Inject
    DummyContract.Presenter mPresenter;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dummy_layout);

        DummyFragment fragment =
                (DummyFragment)
                        getSupportFragmentManager().findFragmentById(R.id.frame_layout_content);
        if (fragment == null) {
            fragment = DummyFragment.newInstance();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.frame_layout_content, fragment);
            transaction.commit();
        }
    }

    @Override
    public void onDummyActivityFragmentInteraction() {
    }

    @Override
    public AndroidInjector<Fragment> fragmentInjector() {
        return frameworkFragmentInjector;
    }

    @Override
    public AndroidInjector<android.support.v4.app.Fragment> supportFragmentInjector() {
        return supportFragmentInjector;
    }
}
