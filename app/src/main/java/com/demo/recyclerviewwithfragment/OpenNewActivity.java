package com.demo.recyclerviewwithfragment;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class OpenNewActivity extends AppCompatActivity {

    ImageView imageView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_new);

        imageView = findViewById(R.id.item_image);
        textView = findViewById(R.id.item_title);


        int stringResourceId = getIntent().getIntExtra("StringResourceId", 0);
        String stringResource = getString(stringResourceId);

        int imageResource = getIntent().getIntExtra("ImageResourceId", 0);

        Log.d("TAG", "String Resource: " + stringResource);
        Log.d("TAG", "Image Resource: " + imageResource);

        textView.setText(stringResource);
        if (imageResource != 0) {
            imageView.setImageResource(imageResource);
        }
    }
}