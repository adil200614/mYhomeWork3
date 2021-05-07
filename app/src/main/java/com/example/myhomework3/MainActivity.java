package com.example.myhomework3;

import androidx.appcompat.app.AppCompatActivity;


import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et_text;
    Button btn_search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_text = findViewById(R.id.et_edit);
        btn_search = findViewById(R.id.bnt_search);
        btn_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
                String words = et_text.getText().toString();
                intent.putExtra(SearchManager.QUERY, words);
                startActivity(intent);
            }
        });
    }

}