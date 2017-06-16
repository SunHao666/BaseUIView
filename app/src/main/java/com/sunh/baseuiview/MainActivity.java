package com.sunh.baseuiview;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.vstechlab.easyfonts.EasyFonts;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView text = (TextView) findViewById(R.id.tv_text);
        TextView text1 = (TextView) findViewById(R.id.tv_text1);
        TextView text2 = (TextView) findViewById(R.id.tv_text2);

        text.setTypeface(EasyFonts.androidNation(this));
        text1.setTypeface(EasyFonts.androidNationBold(this));
        text2.setTypeface(EasyFonts.androidNationItalic(this));
    }
}
