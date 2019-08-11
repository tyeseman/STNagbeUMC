package com.leontyes.stnagbeumc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.leontyes.stnagbeumc.Home;
import com.leontyes.stnagbeumc.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setTitle("");
    }

    public void btnNext(View view) {
        startActivity(new Intent(this, Home.class));

    }
}


