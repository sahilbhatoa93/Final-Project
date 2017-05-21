package com.example.a1691717.facebookjack.feiPackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.a1691717.facebookjack.R;
import com.example.a1691717.facebookjack.sahilPackage.MainActivity;

/**
 * Created by fei on 5/21/17.
 */

public class signin extends Activity{
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up_page);
    }
    public void goTo3(View view)
    {
        Intent intent = new Intent(signin.this, emailToPhone.class);
        startActivity(intent);
    }

    public void goTosahilPart(View view)
    {
        Intent intent = new Intent(signin.this, MainActivity.class);
        startActivity(intent);
    }
}
