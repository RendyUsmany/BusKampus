package com.example.cralr.buskampus;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class GoSchedule extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go_schedule);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_schedule, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.item2:Toast.makeText(this,"Koridor II Selected", Toast.LENGTH_SHORT).show();
                return  true;
            case R.id.item3:Toast.makeText(this,"Koridor II Selected", Toast.LENGTH_SHORT).show();
                return  true;
            //case R.id.item2:Toast.makeText(this,"Item 1 Selected", Toast.LENGTH_SHORT);
               // return  true;
            default:
        }
        return super.onOptionsItemSelected(item);
    }
}
