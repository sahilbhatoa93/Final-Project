package com.example.a1691717.facebookjack.sahilPackage;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.a1691717.facebookjack.R;

/**
 * Created by SAHIL BHATOA on 22-Apr-17.
 */

public class ProfileScreen extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        final View rootview = inflater.inflate(R.layout.activity_profile_screen, container, false);
        final TextView button =(TextView)rootview.findViewById(R.id.whattextview3);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i=new Intent(getActivity(), com.example.a1691717.facebookjack.navtejPackage.UserScreen.class);
                startActivity(i);
            }
        });

        return rootview;
    }
    @Override
    public void onDestroy() {

        super.onDestroy();
    }
}
