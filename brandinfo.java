package com.example.mallandmap;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class brandinfo extends Activity {

    ImageButton back, search ;
    TextView mam, name, age, explain, news_con, news_con1, eve_not;
    ImageView star;
    Button store, news, eve;
    View.OnClickListener cl;
    Intent in1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.brandinfo);

        back = (ImageButton) findViewById(R.id.back);
        search = (ImageButton) findViewById(R.id.search);

        mam = (TextView) findViewById(R.id.mallandmap);
        name = (TextView) findViewById(R.id.brandname);
        age = (TextView) findViewById(R.id.typeage);
        explain = (TextView) findViewById(R.id.explain);
        news_con = (TextView) findViewById(R.id.newscontent);
        news_con1 = (TextView) findViewById(R.id.newscontent1);
        eve_not = (TextView) findViewById(R.id.eventnotice);

        star = (ImageView) findViewById(R.id.star);

        store = (Button) findViewById(R.id.nearbystore);
        news = (Button) findViewById(R.id.news);
        eve = (Button) findViewById(R.id.event);

        cl =  new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch(view.getId()) {
                    case R.id.back:
                        in1 = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(in1);
                        break;
                    case R.id.nearbystore:
                        Uri uri = Uri.parse("https://www.google.co.kr/maps/search/%EB%82%98%EC%9D%B4%ED%82%A4+%EC%84%B1%EB%82%A8%EC%A0%90/@37.4138493,127.1198489,14z/data=!3m1!4b1");
                        //나이키 성남점 구글지도로 표시
                        in1 = new Intent(Intent.ACTION_VIEW, uri);
                        // 삭제 Intent in1 = new Intent(getApplicationContext(), googlemap.class);
                        // in1.setClassName("com.example.googlemap", "com.example.googlemap.MainActivity");
                        startActivity(in1);
                        break;
                    case R.id.news:
                        in1 = new Intent(getApplicationContext(), brandnews.class);
                        startActivity(in1);
                        break;
                }
            }
        };
        back.setOnClickListener(cl);
        search.setOnClickListener(cl);
        store.setOnClickListener(cl);
        news.setOnClickListener(cl);
        eve.setOnClickListener(cl);

    }
}
