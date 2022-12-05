package com.example.mallandmap;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.MainThread;

import java.util.ArrayList;

public class brand extends Activity {

        ImageButton back, home, searchButton;
        TextView title;
        EditText searchbar;
        View.OnClickListener cl;
        Intent itt;



        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.brand);

            back = (ImageButton) findViewById(R.id.back_cat1);
            home = (ImageButton) findViewById(R.id.home1);
            searchButton = (ImageButton) findViewById(R.id.cat_searchButton1);
            title = (TextView) findViewById(R.id.title1);
            searchbar = (EditText) findViewById(R.id.cat_searchbar1);

            final String[] ran = { "나이키", "구찌", "루이비통", "아디다스", "샤넬", "자라", "뉴발란스",
                    "탑텐", "디올", "코치", "푸마", "프라다",   };

            ListView list = (ListView)findViewById(R.id.list1);
            ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, ran);
            list.setAdapter(adapter3);

            list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                    if (position == 0)
                        itt = new Intent(getApplicationContext(), brandinfo.class);
                    startActivity(itt);
                }
            });


            cl = new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    switch (view.getId()) {
                        case R.id.back_cat1:
                            itt = new Intent(getApplicationContext(), MainActivity.class);
                            startActivity(itt);
                            break;
                        case R.id.home1:
                            itt = new Intent(getApplicationContext(), MainActivity.class);
                            startActivity(itt);
                            break;

                    }
                }
            };
            back.setOnClickListener(cl);
            home.setOnClickListener(cl);
            searchButton.setOnClickListener(cl);
        }
    }

