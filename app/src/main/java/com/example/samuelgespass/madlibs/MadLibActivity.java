package com.example.samuelgespass.madlibs;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by samuelgespass on 3/13/18.
 */

public class MadLibActivity extends AppCompatActivity {
    @BindView(R.id.part1) TextView part1;
    @BindView(R.id.part2) TextView part2;
    @BindView(R.id.part3) TextView part3;
    @BindView(R.id.part4) TextView part4;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_madlibs);
        ButterKnife.bind(this);
        Intent intent = getIntent();
        String part1s = intent.getStringExtra("word");
        String part2s = intent.getStringExtra("word0");
        String part3s = intent.getStringExtra("word1");
        String part4s = intent.getStringExtra("word2");
        part1.setText("One day, I was walking down the street when I saw a " + part1s);
        part2.setText("He told me that I had to " + part2s);
        part3.setText("After I completed this task, he gave me a million " + part3s);
        part4.setText("I thanked him, and he walked off into the " + part4s);
    }

}
