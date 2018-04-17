package com.cielyang.android.daggerdemo.dummy;


import com.example.mine.ActivityScoped;

import javax.inject.Inject;

@ActivityScoped
public class DummyPresenter implements DummyContract.Presenter {

    private DummyContract.View mView;

    @Inject
    public DummyPresenter() {
    }

    @Override
    public void takeView(DummyContract.View view) {
        mView = view;
    }

    @Override
    public void dropView() {
        mView = null;
    }

    @Override
    public void loadContent() {
        mView.showContent();
    }
}
