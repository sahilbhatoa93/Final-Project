package com.example.a1691717.facebookjack.feiPackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.a1691717.facebookjack.R;

/**
 * Created by fei on 5/21/17.
 */

public class emailToPhone extends Activity{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.siup_up_withnumber);}


        public void goTo2(View view)
        {
            Intent intent = new Intent(emailToPhone.this, phoneToEmail.class);
            startActivity(intent);
        }

    }
