package com.example.juraj.restmake;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class VerifyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent activity;

        FirebaseUser currentUser = FirebaseAuth.getInstance().getCurrentUser();
        if( currentUser != null ) {
            activity = new Intent(this, MainActivity.class);
        } else {
            activity = new Intent(this, LoginActivity.class);
        }

        startActivity(activity);
        finish();
    }
}