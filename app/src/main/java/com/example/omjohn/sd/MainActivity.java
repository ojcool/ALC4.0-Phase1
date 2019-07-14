package com.example.omjohn.sd;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn;
    Button btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("ALC 4 PHASE 1");
        btn=(Button)findViewById(R.id.btnabout);
        btn2 =(Button)findViewById(R.id.btnprofile);
        btn.setOnClickListener(this);
        btn2.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
                    switch (v.getId())
                    {
                        case R.id.btnabout:
                    Intent intent = new Intent(MainActivity.this, webview.class);
                    startActivity(intent);
                    break;
                case R.id.btnprofile:
                    Intent intent2 = new Intent(getApplicationContext(), Profile.class);
                    startActivity(intent2);
                    break;
            }
    }
}
