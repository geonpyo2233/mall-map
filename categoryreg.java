package com.example.mallandmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;

public class categoryreg extends AppCompatActivity {


    String gen, age, sty;
    Button srh ;
    ImageButton back;
    TextView title, text_gender, text_agegroup, text_style;
    Spinner gender, agegroup, style;
    View.OnClickListener cl;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.categoryreg);

        back = (ImageButton) findViewById(R.id.back);
        srh = (Button) findViewById(R.id.cat_search);
        title = (TextView) findViewById(R.id.title);
        text_gender = (TextView) findViewById(R.id.text_spn_gender);
        text_agegroup = (TextView) findViewById(R.id.text_spn_agegroup);
        text_style = (TextView) findViewById(R.id.text_spn_style);
        gender = (Spinner) findViewById(R.id.spn_gender);
        agegroup = (Spinner) findViewById(R.id.spn_agegroup);
        style = (Spinner) findViewById(R.id.spn_style);

        cl = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch ( view.getId() ){
                    case R.id.cat_search:
                        intent = new Intent(getApplicationContext(), category_result.class);
                        startActivity(intent);
                        break;
                    case R.id.back:
                        intent = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(intent);
                        break;
                }
            }
        };
        srh.setOnClickListener(cl);
        back.setOnClickListener(cl);




        String[] gender = {"??????", "??????", "?????? ??????"};
        Spinner spn_gender = (Spinner) findViewById(R.id.spn_gender);

        ArrayAdapter<String> adap_gender = new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_dropdown_item, gender);
        spn_gender.setAdapter(adap_gender);

        spn_gender.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (adapterView.getSelectedItem().toString()){
                    case "??????":
                        gen = "0";
                        break;
                    case "??????":
                        gen = "1";
                        break;
                    case "?????? ??????":
                        gen = "2";
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        String[] agegroup = {"10??? ??????", "10???", "20???", "30???", "40???", "50??? ??????"};
        Spinner spn_agegroup = (Spinner) findViewById(R.id.spn_agegroup);

        ArrayAdapter<String> adap_agegroup = new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_dropdown_item, agegroup);
        spn_agegroup.setAdapter(adap_agegroup);

        spn_agegroup.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (adapterView.getSelectedItem().toString()){
                    case "10??? ??????":
                        age = "0";
                        break;
                    case "10???":
                        age = "1";
                        break;
                    case "20???":
                        age = "2";
                        break;
                    case "30???":
                        age = "3";
                        break;
                    case "40???":
                        age = "4";
                        break;
                    case "50??? ??????":
                        age = "5";
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        String[] style = {"SPA", "?????????", "?????????", "???????????????", "?????????", "???????????????"};
        Spinner spn_style = (Spinner) findViewById(R.id.spn_style);

        ArrayAdapter<String> adap_style = new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_dropdown_item, style);
        spn_style.setAdapter(adap_style);

        spn_style.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (adapterView.getSelectedItem().toString()){
                    case "SPA":
                        sty = "0";
                        break;
                    case "?????????":
                        sty = "1";
                        break;
                    case "?????????":
                        sty = "2";
                        break;
                    case "???????????????":
                        sty = "3";
                        break;
                    case "?????????":
                        sty = "4";
                        break;
                    case "???????????????":
                        sty = "5";
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });





    }
}