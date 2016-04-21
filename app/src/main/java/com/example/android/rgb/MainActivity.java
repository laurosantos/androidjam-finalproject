package com.example.android.rgb;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setIcon(R.mipmap.ic_launcher);
    }

    public void bt_oque(View view) {

        setContentView(R.layout.oque);
    }

    public void bt_define(View view) {

        setContentView(R.layout.definido);
    }

    public void bt_hexadecimal(View view) {

        setContentView(R.layout.hexadecimal);
    }

    public void bt_cmyk(View view) {

        setContentView(R.layout.rgb_cmyk);
    }

    public void bt_css(View view) {

        setContentView(R.layout.rgbcss);
    }

    public void bt_calculo(View view) {

        setContentView(R.layout.calculo);
    }

    public void bt_volta(View view) {

        setContentView(R.layout.activity_main);
    }
}
