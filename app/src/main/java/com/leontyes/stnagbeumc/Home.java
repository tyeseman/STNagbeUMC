package com.leontyes.stnagbeumc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.util.Objects;

public class Home extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        this.setTitle("Welcome");//this line change the action bar information

        Objects.requireNonNull(getSupportActionBar()).setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == android.R.id.home){
            this.finish();
        }


        if (id==R.id.developer){
            Toast.makeText(this, "Leon C. Tyes\n0775102955\nleon.tyes@gmail.com", Toast.LENGTH_LONG).show();
        }

        if (id==R.id.about){
            Toast.makeText(this, "Version 1.0\nSTNUMCYAF\nThis application was inspired by Dearest Edwina Karnga in 2017, and a production of TYESE STUDIO INC.", Toast.LENGTH_LONG).show();
        }

        return super.onOptionsItemSelected(item);
    }


    public void communionBtn(View view) {
        startActivity(new Intent(this, CommunionBulletin.class));

    }

    public void prayerBtn(View view) {
        startActivity(new Intent(this, PrayerBenediction.class));

    }

    public void apostleBtn(View view) {
        startActivity(new Intent(this, ApostleCreed.class));

    }

    public void songsBtn(View view) {
        startActivity(new Intent(this, CelebrantSongs.class));

    }

    public void contactBtn(View view) {
        startActivity(new Intent(this, ChurchContacts.class));

    }


    public void activitiesBtn(View view) {
        startActivity(new Intent(this, WeeklyActivities.class));

    }

    public void officeHrBtn(View view) {
        startActivity(new Intent(this, OfficeHours.class));

    }


}



