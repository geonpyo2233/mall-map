package com.example.mallandmap;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


public class login extends AppCompatActivity {
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        mAuth = FirebaseAuth.getInstance();

        findViewById(R.id.check2button).setOnClickListener(onClickListener);
        findViewById(R.id.gotopasswordResetButton).setOnClickListener(onClickListener);
    }

    View.OnClickListener onClickListener= (v) -> {
        switch (v.getId()){
            case R.id.check2button:
                login();
                break;
            case R.id.gotopasswordResetButton:
                myStartActivity(passwdreset.class);
                break;
        }

    };

    private void login(){
        String email = ((EditText)findViewById(R.id.email)).getText().toString();
        String password = ((EditText)findViewById(R.id.password)).getText().toString();

        if(email.length() > 0 && password.length() > 0){
            mAuth.signInWithEmailAndPassword(email, password)
                    .addOnCompleteListener(this, task -> {
                        if (task.isSuccessful()) {
                            FirebaseUser user = mAuth.getCurrentUser();
                            startToast( "로그인에 성공했습니다.");
                            myStartActivity(MainActivity.class);
                        } else {
                            if(task.getException() != null ){
                                startToast(task.getException().toString());
                            }
                        }
                    });
        }else{
            startToast( "이메일 또는 비밀번호를 입력해 주세요.");
        }
    }

    private void startToast(String msg){ Toast.makeText(this, msg, Toast.LENGTH_SHORT).show(); }

    private void myStartActivity(Class c){
        Intent intent = new Intent(this, c);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }
}
