package com.cielyang.android.daggerdemo.dummy;


import com.example.mine.base.BasePresenter;
import com.example.mine.base.BaseView;

public interface DummyContract {

    interface View extends BaseView<Presenter> {

        void showContent();
    }

    interface Presenter extends BasePresenter<View> {

        void loadContent();
    }
}
