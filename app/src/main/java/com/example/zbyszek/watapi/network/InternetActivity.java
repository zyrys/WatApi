package com.example.zbyszek.watapi.network;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;

import com.octo.android.robospice.SpiceManager;

/**
 * Created by zbyszek on 17.09.15.
 */
public class InternetActivity extends AppCompatActivity {
    protected SpiceManager spiceManager = new SpiceManager(ApiService.class);

    @Override
    protected void onStart(){
        super.onStart();
        spiceManager.start(this);
    }

    @Override
    protected void onStop(){
        spiceManager.shouldStop();
        super.onStop();
    }
}
