package com.thinkcoo.www.draggertest;

import dagger.Component;

/**
 * Created by admin on 2016/5/23.
 */
@Component(modules = ActivityModule.class)
public interface ActivityComponent {

    //    void inject(MainActivity activity);
    // expose
    User user();

    void inject(MainActivity mainActivity);
}
