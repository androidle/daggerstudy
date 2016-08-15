package com.thinkcoo.www.draggertest;

import android.app.Activity;
import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends Activity {

    private ActivityComponent activityComponent;
    @Inject
    User mUser;
//    @Inject
//    ShoppingCartModel shoppingCartModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //  this is the injector
        ActivityComponent omponent = DaggerActivityComponent.create();
        omponent.user().call();
        this.activityComponent = DaggerActivityComponent.builder().activityModule(new ActivityModule()).build();
        System.out.println("=================="+ mUser);
//        ContainerComponent containerComponent = DaggerContainerComponent.builder().activityComponent(activityComponent).containerModule(new ContainerModule()).build();
//        containerComponent.inject(this);
        this.activityComponent.user().call();
        System.out.println("======================"+ this.activityComponent.user().getPassword());
        System.out.println("========================"+ this.activityComponent.user().toString());


//        activityComponent.inject(this);
//        System.out.println("=================="+ mUser.toString());
//        System.out.println(shoppingCartModel.id +"=============="+shoppingCartModel.name);

    }
}
