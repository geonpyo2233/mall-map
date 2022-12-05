package com.example.mallandmap;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.FirebaseFirestore;


public class member_info extends AppCompatActivity {
    private static final String TAG = "member_info";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.member_info);

        findViewById(R.id.check3button).setOnClickListener(onClickListener);
    }

    @Override
    public void onBackPressed(){
        super.onBackPressed();
        finish();
    }

    View.OnClickListener onClickListener= (v) -> {
        switch (v.getId()){
            case R.id.check3button:
                profileUpdate();
                break;

        }
    };

    private void profileUpdate(){
        String name = ((EditText)findViewById(R.id.nameEdittext)).getText().toString();
        String phoneNumber = ((EditText)findViewById(R.id.phoneNumberEdittext)).getText().toString();
        String birthday = ((EditText)findViewById(R.id.birthdayEdittext)).getText().toString();
        String address = ((EditText)findViewById(R.id.addressEdittext)).getText().toString();

        if( name.length() > 0 && phoneNumber.length() > 9 && birthday.length() > 5 && address.length() > 0){
            FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
            FirebaseFirestore db = FirebaseFirestore.getInstance();
            memberinfo memberInfo = new memberinfo(name, phoneNumber, birthday, address);

            if(user != null){
                db.collection("users").document(user.getUid()).set(memberInfo)
                        .addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void aVoid) {
                                startToast( "회원정보 등록을 성공했습니다.");
                                finish();
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                startToast( "회원정보 등록에 실패했습니다.");
                                Log.w(TAG, "Error writing document", e);
                            }
                        });
            }



        }else{
            startToast( "회원정보를 입력해주세요.");
        }
    }

    private void startToast(String msg){ Toast.makeText(this, msg, Toast.LENGTH_SHORT).show(); }
}

