package com.example.inarotzk.ultimateathleticism;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class UpperBodyActivity extends AppCompatActivity {

    public static Intent makeIntent(Context context) {
        return new Intent(context, UpperBodyActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upper_body);

        setupEndActivity();
    }

    private void setupEndActivity() {
        Button btn = findViewById(R.id.endUpperActivity);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

}
