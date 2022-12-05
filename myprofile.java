package com.example.mallandmap;

import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;

public class myprofile extends Activity {
    private static final String TAG = "myprofile";
    TextView fullname, birth, phone;
    Button logoutt, info;
    FirebaseAuth fAuth;
    FirebaseFirestore fStore;
    String userId;
    View.OnClickListener cl;
    ImageButton back3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.myprofile);
        phone = findViewById(R.id.phonenumber);
        fullname = findViewById(R.id.fullname);
        birth = findViewById(R.id.birth);
        logoutt = findViewById(R.id.logouttt);
        fAuth = FirebaseAuth.getInstance();
        fStore = FirebaseFirestore.getInstance();
        back3 = findViewById(R.id.backbutton3);
        info = findViewById(R.id.profile);

        userId = fAuth.getCurrentUser().getUid();

        DocumentReference documentReference = fStore.collection("users").document(userId);
        documentReference.addSnapshotListener(this, new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot documentSnapshot, @Nullable FirebaseFirestoreException e) {
                phone.setText("전화번호: "+documentSnapshot.getString("phoneNumber"));
                fullname.setText("이름: "+documentSnapshot.getString("name")+"님");
                birth.setText("생년월일: "+documentSnapshot.getString("birthday"));
            }
        });
        cl = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.logouttt:
                        FirebaseAuth.getInstance().signOut();
                        myStartActivity(signup.class);
                        break;
                    case R.id.backbutton3:
                        mybackActivity(MainActivity.class);
                        break;
                    case R.id.profile:
                        myfrontActivity(member_info.class);
                        break;
                }
            }
        };

        logoutt.setOnClickListener(cl);
        back3.setOnClickListener(cl);
        info.setOnClickListener(cl);
    }

    private void myStartActivity(Class c){
        Intent intent = new Intent(this, c);
        startActivity(intent);
    }
    private void mybackActivity(Class c){
        Intent intent = new Intent(this, c);
        startActivity(intent);
    }

    private void myfrontActivity(Class c){
        Intent intent = new Intent(this, c);
        startActivity(intent);
    }
}
