package com.example.mallandmap;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class news extends brandinfo {
    ImageButton back, img0, img1, img2, img3, img4, img5;
    View.OnClickListener cl;
    Intent i1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.news);

        back = (ImageButton) findViewById(R.id.back_news);

        img0 = (ImageButton) findViewById(R.id.imageButton0);
        img1 = (ImageButton) findViewById(R.id.imageButton1);
        img2 = (ImageButton) findViewById(R.id.imageButton2);
        img3 = (ImageButton) findViewById(R.id.imageButton3);
        img4 = (ImageButton) findViewById(R.id.imageButton4);
        img5 = (ImageButton) findViewById(R.id.imageButton5);



        cl = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.back_news:
                        Intent i2;
                        i2 = new Intent(getApplicationContext(), MainActivity.class);
                        finish();
                        break;
                    case R.id.imageButton0:
                        i1 = new Intent();
                        i1.setAction(Intent.ACTION_VIEW);
                        i1.setData(Uri.parse("http://www.lcnews.co.kr/news/articleView.html?idxno=27298"));
                        startActivity(i1);
                        break;
                    case R.id.imageButton1:
                        i1 = new Intent();
                        i1.setAction(Intent.ACTION_VIEW);
                        i1.setData(Uri.parse("https://kr.investing.com/news/economy/article-729169"));
                        startActivity(i1);
                        break;
                    case R.id.imageButton2:
                        i1 = new Intent();
                        i1.setAction(Intent.ACTION_VIEW);
                        i1.setData(Uri.parse("https://www.ktnews.com/news/articleView.html?idxno=121738"));
                        startActivity(i1);
                        break;
                    case R.id.imageButton3:
                        i1 = new Intent();
                        i1.setAction(Intent.ACTION_VIEW);
                        i1.setData(Uri.parse("https://www.jejutwn.com/news/article.html?no=110290"));
                        startActivity(i1);
                        break;
                    case R.id.imageButton4:
                        i1 = new Intent();
                        i1.setAction(Intent.ACTION_VIEW);
                        i1.setData(Uri.parse("https://news.sbs.co.kr/news/endPage.do?news_id=N1006547805"));
                        startActivity(i1);
                        break;
                    case R.id.imageButton5:
                        i1 = new Intent();
                        i1.setAction(Intent.ACTION_VIEW);
                        i1.setData(Uri.parse("https://www.mk.co.kr/news/world/view/2021/11/1095695/"));
                        startActivity(i1);
                        break;
                }
            }
        };
        back.setOnClickListener(cl);
        img0.setOnClickListener(cl);
        img1.setOnClickListener(cl);
        img2.setOnClickListener(cl);
        img3.setOnClickListener(cl);
        img4.setOnClickListener(cl);
        img5.setOnClickListener(cl);

    }
}
