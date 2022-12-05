package com.example.mallandmap;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Spinner;

import androidx.annotation.Nullable;

import java.util.List;


public class brandrank extends Activity {

    ImageButton back, hom;
    Spinner gen, age;
    View.OnClickListener cl;
    Intent in;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.brandrank);
        setTitle("브랜드 순위");

        back = (ImageButton) findViewById(R.id.back);
        hom = (ImageButton) findViewById(R.id.home);

        //리스트
        final String[] ran = { "1. 나이키", "2. 구찌", "3. 루이비통", "4. 아디다스", "5. 샤넬", "6. 자라", "7. 뉴발란스",
                "8. 탑텐", "9. 디올", "10. 코치", "11. 푸마", "12. 프라다",   };

        ListView list = (ListView)findViewById(R.id.list1);
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, ran);
        list.setAdapter(adapter3);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                    if (position == 0)
                        in = new Intent(getApplicationContext(), brandinfo.class);
                    startActivity(in);
                }
            });

        cl = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch ( view.getId() ) {
                    case R.id.back:
                        Intent in = new Intent(getApplicationContext(), drawer.class);
                        startActivity(in);
                        break;
                    case R.id.home:
                        Intent in1 = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(in1);
                        break;
                }
            }
        };
        back.setOnClickListener(cl);
        hom.setOnClickListener(cl);
    }
}
