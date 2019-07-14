package com.example.omjohn.sd;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class Profile extends Activity  {
    ImageView img;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        System.out.println("profile image");
       img=(ImageView)findViewById(R.id.imageView);
       img.setImageResource(R.drawable.logo);


    }
}
