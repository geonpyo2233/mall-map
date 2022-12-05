package com.example.mallandmap;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class drawer extends AppCompatActivity {
    ImageButton back, search_ic, mybrand_ic, news_ic, ranking_ic, center_ic, notifi_ic;
    TextView mam, brand_search, mybrand, brand_news, brand_ranking, brand_center, brand_notifi;
    View.OnClickListener cl;
    Intent i1;

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        setContentView(R.layout.drawer);

        back = (ImageButton) findViewById(R.id.back);
        search_ic = (ImageButton) findViewById(R.id.search_ic);
        mybrand_ic = (ImageButton) findViewById(R.id.mybrand_ic);
        news_ic = (ImageButton) findViewById(R.id.news_ic);
        ranking_ic = (ImageButton) findViewById(R.id.ranking_ic);
        center_ic = (ImageButton) findViewById(R.id.center_ic);
        notifi_ic = (ImageButton) findViewById(R.id.notifi_ic);

        mam = (TextView) findViewById(R.id.mallandmap);
        brand_search = (TextView) findViewById(R.id.brand_search);
        mybrand = (TextView) findViewById(R.id.mybrand);
        brand_news = (TextView) findViewById(R.id.brand_news);
        brand_ranking = (TextView) findViewById(R.id.brand_ranking);
        brand_center = (TextView) findViewById(R.id.brand_center);
        brand_notifi = (TextView) findViewById(R.id.brand_notifi);

        cl = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.back:
                        i1 = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(i1);
                        break;
                    case R.id.search_ic:
                        i1 = new Intent(getApplicationContext(), brand.class);
                        startActivity(i1);
                        break;
                    case R.id.mybrand_ic:
                        break;
                    case R.id.news_ic:
                        i1 = new Intent(getApplicationContext(), news.class);
                        startActivity(i1);
                        break;
                    case R.id.ranking_ic:
                        i1 = new Intent(getApplicationContext(), brandrank.class);
                        startActivity(i1);
                        break;
                    case R.id.center_ic:
                        i1 = new Intent(getApplicationContext(), center.class);
                        startActivity(i1);
                        break;
                    case R.id.notifi_ic:
                        i1 = new Intent(getApplicationContext(), notifi.class);
                        startActivity(i1);
                        break;
                }
            }
        };
        back.setOnClickListener(cl);
        search_ic.setOnClickListener(cl);
        mybrand_ic.setOnClickListener(cl);
        news_ic.setOnClickListener(cl);
        ranking_ic.setOnClickListener(cl);
        center_ic.setOnClickListener(cl);
        notifi_ic.setOnClickListener(cl);
    }
}
