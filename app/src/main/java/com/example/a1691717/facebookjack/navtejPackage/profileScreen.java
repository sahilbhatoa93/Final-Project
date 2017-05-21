package com.example.a1691717.facebookjack.navtejPackage;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

import com.example.a1691717.facebookjack.R;

public class profileScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_screen);
        final TextView button =(TextView)findViewById(R.id.whattextviewnn);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
               Intent i=new Intent(profileScreen.this,UserScreen.class);
                startActivity(i);
            }
        });
        final CardView whatOnYourMindCardView9 =(CardView)findViewById(R.id.whatOnYourMindCardView9);
        whatOnYourMindCardView9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i=new Intent(profileScreen.this,nearByFriends.class);
                startActivity(i);
            }
        });

    }


}
