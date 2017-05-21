package com.example.a1691717.facebookjack.feiPackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.a1691717.facebookjack.R;

/**
 * Created by fei on 5/21/17.
 */

public class phoneToEmail extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up_withemail);
    }
    public void goTo2(View view)
    {
        Intent intent = new Intent(phoneToEmail.this, emailToPhone.class);
        startActivity(intent);
    }

}

