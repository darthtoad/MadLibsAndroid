package com.example.samuelgespass.madlibs;

import android.content.Intent;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();
    @BindView(R.id.button) Button button;
    @BindView(R.id.editText) EditText editText;
    @BindView(R.id.editText0) EditText editText0;
    @BindView(R.id.editText1) EditText editText1;
    @BindView(R.id.editText2) EditText editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String word = editText.getText().toString();
                String word0 = editText0.getText().toString();
                String word1 = editText1.getText().toString();
                String word2 = editText2.getText().toString();
                Log.d(TAG, word);
                Intent intent = new Intent(MainActivity.this, MadLibActivity.class);
                intent.putExtra("word", word);
                intent.putExtra("word0", word0);
                intent.putExtra("word1", word1);
                intent.putExtra("word2", word2);
                startActivity(intent);
            }
        });
    }
}
