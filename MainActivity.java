package com.example.mallandmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    ImageButton menu, search, calendar, rank1, rank2, rank3, rank4, news1, news2, news3,
            category, brand, main, mypage, chatbot;
    TextView mam, rank, news, cat_kor, bra_kor, myp_kor, cha_kor;
    ImageView mainimg;
    View.OnClickListener cl;
    Intent i1;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            menu = (ImageButton) findViewById(R.id.menu);
            search = (ImageButton) findViewById(R.id.search);
            calendar = (ImageButton) findViewById(R.id.calendar);

            rank1 = (ImageButton) findViewById(R.id.brandranking1);
            rank2 = (ImageButton) findViewById(R.id.brandranking2);
            rank3 = (ImageButton) findViewById(R.id.brandranking3);
            rank4 = (ImageButton) findViewById(R.id.brandranking4);
            news1 = (ImageButton) findViewById(R.id.brandnews1);
            news2 = (ImageButton) findViewById(R.id.brandnews2);
            news3 = (ImageButton) findViewById(R.id.brandnews3);
            category = (ImageButton) findViewById(R.id.category);
            brand = (ImageButton) findViewById(R.id.brand);
            main = (ImageButton) findViewById(R.id.mainscreen);
            mypage = (ImageButton) findViewById(R.id.mypage);
            chatbot = (ImageButton) findViewById(R.id.chatbot);

            mam = (TextView) findViewById(R.id.mallandmap);
            rank = (TextView) findViewById(R.id.rank);
            news = (TextView) findViewById(R.id.news);
            cat_kor = (TextView) findViewById(R.id.category_kor);
            bra_kor = (TextView) findViewById(R.id.brand_kor);
            myp_kor = (TextView) findViewById(R.id.mypage_kor);
            cha_kor = (TextView) findViewById(R.id.chatbot_kor);

            mainimg = (ImageView) findViewById(R.id.mainimage);

            cl = new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    switch ( view.getId() ) {
                        case R.id.menu:
                            i1 = new Intent(getApplicationContext(), drawer.class);
                            startActivity(i1);
                            break;
                        case R.id.search:
                            break;
                        case R.id.calendar:
                            break;
                        case R.id.brandranking1:
                            i1 = new Intent(getApplicationContext(), brandinfo.class);
                            //startActivityForResult(i1, brandranking1);
                            startActivity(i1);
                            break;
                        case R.id.brandnews1:
                            i1 = new Intent(getApplicationContext(), news.class);
                            startActivity(i1);
                            break;
                        case R.id.category:
                            i1 = new Intent(getApplicationContext(), categoryreg.class);
                            startActivity(i1);
                            break;
                        case R.id.brand:
                            i1 = new Intent(getApplicationContext(), brand.class);
                            startActivity(i1);
                            break;
                        case R.id.mainscreen:
                            break;
                        case R.id.mypage:
                            i1 = new Intent(getApplicationContext(), myprofile.class);
                            startActivity(i1);
                            break;
                        case R.id.chatbot:
                            Intent intent = new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse("https://sites.google.com/view/mallandmap"));
                            startActivity(intent);
                            break;
                    }
                }
            };
            menu.setOnClickListener(cl);
            search.setOnClickListener(cl);
            calendar.setOnClickListener(cl);
            rank1.setOnClickListener(cl);
            news1.setOnClickListener(cl);
            category.setOnClickListener(cl);
            brand.setOnClickListener(cl);
            main.setOnClickListener(cl);
            mypage.setOnClickListener(cl);
            chatbot.setOnClickListener(cl);
        }
}



