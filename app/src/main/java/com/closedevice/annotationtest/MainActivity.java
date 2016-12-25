package com.closedevice.annotationtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.closedevice.annotation.Code;
import com.closedevice.annotation.Print;


public class MainActivity extends AppCompatActivity {

    @Override
    @Print
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        process();
    }

    @Code(author = "closedevice", date = "20161225")
    private void process() {
        new MainActivityAutogenerate().message();
    }


}
