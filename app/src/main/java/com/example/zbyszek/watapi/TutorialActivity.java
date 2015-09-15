package com.example.zbyszek.watapi;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.zbyszek.watapi.R;

/**
 * Created by zbyszek on 15.09.15.
 */
public class TutorialActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_tutorial);
    }

    public void onNextClick(View view) {
        Intent intent;
        intent = new Intent(this, HomeActivity.class);

        startActivity(intent);
    }
}
