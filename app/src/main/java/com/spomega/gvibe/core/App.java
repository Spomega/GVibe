package com.spomega.gvibe.core;

import android.app.Application;

public class App extends Application {

    private ApplicationComponent component;


    public void onCreate(){
        super.onCreate();

        component = DaggerApplicationComponent
                 .builder()
                 .applicationModule(new ApplicationModule(this))
                 .build();
    }


    public ApplicationComponent getComponent() {
        return component;
    }
}
