package com.thinkcoo.www.draggertest;

import android.app.Activity;
import android.os.Bundle;

import javax.inject.Inject;

import component.ContainerComponent;
import component.DaggerContainerComponent;
import module.ContainerModule;
import module.ShoppingCartModel;

public class MainActivity extends Activity {

    private ActivityComponent activityComponent;
    @Inject
    UserModule userModule;
    @Inject
    ShoppingCartModel shoppingCartModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //  this is the injector
        activityComponent = DaggerActivityComponent.builder().activityModule(new ActivityModule()).build();
        ContainerComponent containerComponent = DaggerContainerComponent.builder().activityComponent(activityComponent).containerModule(new ContainerModule()).build();
        containerComponent.inject(this);

//        activityComponent.inject(this);
//        userModule.call();
        activityComponent.userModule().call();

        System.out.println(shoppingCartModel.id +"=============="+shoppingCartModel.name);
    }
}
