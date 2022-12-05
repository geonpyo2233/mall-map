package com.example.mallandmap;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class center extends AppCompatActivity {
    ImageButton back;
    TextView mam, one, inq, rep, fre;
    View.OnClickListener cl;
    Intent i1;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.center);

        back = (ImageButton) findViewById(R.id.back);
        mam = (TextView) findViewById(R.id.mallandmap);
        one = (TextView) findViewById(R.id.one);
        inq = (TextView) findViewById(R.id.inquirydetails);
        rep = (TextView) findViewById(R.id.report);
        fre = (TextView) findViewById(R.id.freqa);

        cl = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch ( view.getId() ){
                    case R.id.back:
                        i1 = new Intent(getApplicationContext(), drawer.class);
                        startActivity(i1);
                        break;
                }
            }
        };
        back.setOnClickListener(cl);
    }
}
