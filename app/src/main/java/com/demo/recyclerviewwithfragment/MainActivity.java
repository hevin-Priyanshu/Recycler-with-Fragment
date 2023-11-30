package com.demo.recyclerviewwithfragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button fragABtn, fragBBtn, fragCBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragABtn = findViewById(R.id.fragABtn);
        fragBBtn = findViewById(R.id.fragBBtn);
        fragCBtn = findViewById(R.id.fragCBtn);

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.frameLayoutView, new FragmentA());
        ft.commit();

        fragABtn.setOnClickListener(view -> {

            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.add(R.id.frameLayoutView, new FragmentA());
            fragmentTransaction.commit();

        });

        fragBBtn.setOnClickListener(view -> {

            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.add(R.id.frameLayoutView, new FragmentB());
            fragmentTransaction.commit();


        });

        fragCBtn.setOnClickListener(view -> {

            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.add(R.id.frameLayoutView, new FragmentC());
            fragmentTransaction.commit();

        });
    }
}