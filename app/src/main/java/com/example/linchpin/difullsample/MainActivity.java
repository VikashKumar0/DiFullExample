package com.example.linchpin.difullsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    DBManager dbManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeInjector(App.get(this).getAppComponent());
        if(dbManager != null){
            Log.d("Vikash kumar", "Object injected.");

        }else{

            Log.d("Vikash kumar", "Object is not injected.");
        }
    }

    protected void initializeInjector(AppComponent appComponent) {
        DaggerMainActivityComponent.builder()
                .appComponent(appComponent)
                .mainActivityModule(new MainActivityModule(this))
                .build()
                .inject(this);
    }
}
