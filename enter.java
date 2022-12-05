package com.example.mallandmap;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class enter extends AppCompatActivity {

    ImageView ent;
    Button mam_login, mam_join;
    View.OnClickListener cl;
    Intent in;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enter);

        ent = (ImageView) findViewById(R.id.enter);
        mam_login = (Button) findViewById(R.id.mam_login);
        mam_join = (Button) findViewById(R.id.mam_join);

        cl = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch( view.getId() ) {
                    case R.id.mam_login:
                        in = new Intent(getApplicationContext(), login.class);
                        startActivity(in);
                        break;
                    case R.id.mam_join:
                        in = new Intent(getApplicationContext(), signup.class);
                        startActivity(in);
                        break;
                }
            }
        };
        mam_login.setOnClickListener(cl);
        mam_join.setOnClickListener(cl);
    }
}
