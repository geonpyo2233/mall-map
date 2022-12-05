package com.example.mallandmap;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class notifi extends AppCompatActivity {
    ImageButton back;
    TextView mam, bins, nba, brm, nsetting, emailmarset ;
    Button onbtn, offbtn, onbtn1, offbtn1;
    View.OnClickListener cl;
    Intent i1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notifi);

        back = (ImageButton) findViewById(R.id.back);

        mam = (TextView) findViewById(R.id.mallandmap);
        bins = (TextView) findViewById(R.id.bins);
        nba = (TextView) findViewById(R.id.nba);
        brm = (TextView) findViewById(R.id.brm);
        nsetting = (TextView) findViewById(R.id.nsetting);
        emailmarset = (TextView) findViewById(R.id.emailmarset);

        onbtn = (Button) findViewById(R.id.onbtn);
        offbtn = (Button) findViewById(R.id.offbtn);
        onbtn1 = (Button) findViewById(R.id.onbtn1);
        offbtn1 = (Button) findViewById(R.id.offbtn1);

        cl = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch ( view.getId() ) {
                    case R.id.back:
                        i1 = new Intent(getApplicationContext(), drawer.class);
                        startActivity(i1);
                        break;
                }
            }
        };
        back.setOnClickListener(cl);
        onbtn.setOnClickListener(cl);
        offbtn.setOnClickListener(cl);
        onbtn1.setOnClickListener(cl);
        offbtn1.setOnClickListener(cl);
    }
}
