package com.example.mallandmap;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class category_result extends AppCompatActivity {

    ImageButton back, home, searchButton;
    TextView title, userselect;
    EditText searchbar;
    View.OnClickListener cl;
    Intent itt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category_result);

        back = (ImageButton) findViewById(R.id.back_cat);
        home = (ImageButton) findViewById(R.id.home);
        searchButton = (ImageButton) findViewById(R.id.cat_searchButton);
        title = (TextView) findViewById(R.id.title);
        userselect = (TextView) findViewById(R.id.cat_userselect);
        searchbar = (EditText) findViewById(R.id.cat_searchbar);

        final String[] ran = { "나이키", "아디다스", };

        ListView list = (ListView)findViewById(R.id.list_cat);
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
                    case R.id.back_cat:
                        itt = new Intent(getApplicationContext(), categoryreg.class);
                        startActivity(itt);
                        break;
                    case R.id.home:
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
