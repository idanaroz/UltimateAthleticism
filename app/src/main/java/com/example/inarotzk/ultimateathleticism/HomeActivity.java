package com.example.inarotzk.ultimateathleticism;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {
    private static final String TAG = "MyApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //wire the button to do stuff

        //.. get the button
        Button btn = findViewById(R.id.ButtonUpperBody);
        // ..set what happends when the user clicks

        View.OnClickListener onClickListener;
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i(TAG, "UpperBody has been clicked");
                Toast.makeText(getApplicationContext(), "Lets rock!", Toast.LENGTH_SHORT).
                        show();

                //launch the second activity
//                Intent intent = new Intent(HomeActivity.this, UpperBodyActivity.class);
                Intent intent = UpperBodyActivity.makeIntent(HomeActivity.this);
                startActivity(intent);
            }
        });
    }
}
