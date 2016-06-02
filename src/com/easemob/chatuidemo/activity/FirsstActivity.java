package com.easemob.chatuidemo.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.easemob.chatuidemo.R;

public class FirsstActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firsst);
    }
    public void firstLogin(View view) {
        startActivityForResult(new Intent(this, LoginActivity.class), 0);
    }

    public void firstRegister(View view) {
        startActivityForResult(new Intent(this, RegisterActivity.class), 0);
    }
}
